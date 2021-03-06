package eit.linecode;

/**
 * This interface contains initializations that are used in other classes.
 * 
 * @author Thanh Tung Trinh
 *
 */

public interface Codes6T {

	int FIRST = 1;
	int SECOND = 2;
	int FOURTH = 4;
	int FIFTH = 5;
	int NINE = 9;
	int THIRD = 3;
	int CODE_LENGTH = 6;
	int EIGHT = 8;
	int LENGTH_OF_END = 12;
	int CUT_TEXT = 13;
	int MAX_FILE_BYTE = 24;
	int CUT_WORD_ENCODE = 7;
	int CODE1_BEGIN = 16;
	int CODE2_BEGIN = 18;
	int CODE3_BEGIN = 20;
	int MIN_FNL = 4;
	int MAX_FNL = 256;
	int MAX_BYTE = 2048;

	String TABLE = "00 +-==+-   20 ==-++-   40 +=+==- 60 =-=++=\n" + "01 =+-+-= 21 --+==+ 41 ++==-= 61 ==-+=+\n"
			+ "02 +-=+-= 22 ++-=+- 42 +=+=-= 62 =-=+=+\n" + "03 -=++-= 23 ++-=-+ 43 =++=-= 63 -==+=+\n"
			+ "04 -=+=+- 24 ==+=-+ 44 =++==- 64 -==++=\n" + "05 =+--=+ 25 ==+=+- 45 ++=-== 65 ==-=++\n"
			+ "06 +-=-=+ 26 ==-==+ 46 +=+-== 66 =-==++\n" + "07 -=+-=+ 27 --+++- 47 =++-== 67 -===++\n"
			+ "08 -+==+- 28 -=-++= 48 ===+== 68 -+-++=\n" + "09 =-++-= 29 --=+=+ 49 ===-++ 69 --++=+\n"
			+ "0a -+=+-= 2a -=-+=+ 4a ===+-+ 6a -+-+=+\n" + "0b +=-+-= 2b =--+=+ 4b ===++- 6b +--+=+\n"
			+ "0c +=-=+- 2c =--++= 4c ===-+= 6c +--++=\n" + "0d =-+-=+ 2d --==++ 4d ===-=+ 6d --+=++\n"
			+ "0e -+=-=+ 2e -=-=++ 4e ===+-= 6e -+-=++\n" + "0f +=--=+ 2f =--=++ 4f ===+=- 6f +--=++\n"
			+ "10 +=+--= 30 +-==-+ 50 +=+--+ 70 -++===\n" + "11 ++=-=- 31 =+--+= 51 ++=-+- 71 +-+===\n"
			+ "12 +=+-=- 32 +-=-+= 52 +=+-+- 72 ++-===\n" + "13 =++-=- 33 -=+-+= 53 =++-+- 73 ==+===\n"
			+ "14 =++--= 34 -=+=-+ 54 =++--+ 74 -=+===\n" + "15 ++==-- 35 =+-+=- 55 ++=+-- 75 =-+===\n"
			+ "16 +=+=-- 36 +-=+=- 56 +=++-- 76 +=-===\n" + "17 =++=-- 37 -=++=- 57 =+++-- 77 =+-===\n"
			+ "18 =+-=+- 38 -+==-+ 58 +++=-- 78 =--+++\n" + "19 =+-=-+ 39 =-+-+= 59 +++-=- 79 -=-+++\n"
			+ "1a =+-++- 3a -+=-+= 5a +++--= 7a --=+++\n" + "1b =+-==+ 3b +=--+= 5b ++=--= 7b --=++=\n"
			+ "1c =-+==+   3c +=-=-+ 5c ++=--+ 7c ++-==-\n" + "1d =-+++- 3d =-++=- 5d ++===- 7d ==+==-\n"
			+ "1e =-+=-+ 3e -+=+=- 5e --+++= 7e ++---+\n" + "1f =-+=+- 3f +=-+=- 5f ==-++= 7f ==+--+\n"
			+ "80 +-+==- a0 =-=++- c0 +-+=+- e0 +-=++-\n" + "81 ++-=-= a1 ==-+-+ c1 ++-+-= e1 =+-+-+\n"
			+ "82 +-+=-= a2 =-=+-+ c2 +-++-= e2 +-=+-+\n" + "83 -++=-= a3 -==+-+ c3 -+++-= e3 -=++-+\n"
			+ "84 -++==- a4 -==++- c4 -++=+- e4 -=+++-\n" + "85 ++--== a5 ==--++ c5 ++--=+ e5 =+--++\n"
			+ "86 +-+-== a6 =-=-++ c6 +-+-=+ e6 +-=-++\n" + "87 -++-== a7 -==-++ c7 -++-=+ e7 -=+-++\n"
			+ "88 =+===-   a8 -+-++- c8 =+==+- e8 -+=++-\n" + "89 ==+=-= a9 --++-+ c9 ==++-= e9 =-++-+\n"
			+ "8a =+==-=   aa -+-+-+ ca =+=+-= ea -+=+-+\n" + "8b +===-= ab +--+-+ cb +==+-= eb +=-+-+\n"
			+ "8c +====-   ac +--++- cc +===+- ec +=-++-\n" + "8d ==+-== ad --+-++ cd ==+-=+ ed =-+-++\n"
			+ "8e =+=-==   ae -+--++ ce =+=-=+ ee -+=-++\n" + "8f +==-== af +---++ cf +==-=+ ef +=--++\n"
			+ "90 +-+--+  b0 =-===+ d0 +-+=-+ f0 +-===+\n" + "91 ++--+- b1 ==-=+= d1 ++--+= f1 =+-=+=\n"
			+ "92 +-+-+-  b2 =-==+= d2 +-+-+= f2 +-==+=\n" + "93 -++-+- b3 -===+= d3 -++-+= f3 -=+=+=\n"
			+ "94 -++--+  b4 -====+ d4 -++=-+ f4 -=+==+\n" + "95 ++-+-- b5 ==-+== d5 ++-+=- f5 =+-+==\n"
			+ "96 +-++--  b6 =-=+== d6 +-++=- f6 +-=+==\n" + "97 -+++-- b7 -==+== d7 -+++=- f7 -=++==\n"
			+ "98 =+=--+  b8 -+-==+ d8 =+==-+ f8 -+===+\n" + "99 ==+-+- b9 --+=+= d9 ==+-+= f9 =-+=+=\n"
			+ "9a =+=-+-  ba -+-=+= da =+=-+= fa -+==+=\n" + "9b +==-+- bb +--=+= db +==-+= fb +=-=+=\n"
			+ "9c +==--+   bc +--==+ dc +===-+ fc +=-==+\n" + "9d ==++-- bd --++== dd ==++=- fd =-++==\n"
			+ "9f +==+--  bf +--+== df +==+=- ff +=-+==\n" + "9e =+=+-- be -+-+== de =+=+=-   fe -+=+==  ";

	String SOSA = "+-+-+-";
	String SOSB = "+-+--+";
	String EOP1 = "++++++";
	String EOP2 = "++++--";
	String EOP3 = "++--==";
	String EOP4 = "------";
	String EOP5 = "--====";
	String P3 = "+-";
	String P4 = "+-+-";

	String DATA_1_START = P4 + SOSA + SOSB;
	String DATA_2_START = SOSA + SOSA + SOSB;
	String DATA3START = P3 + SOSA + SOSA + SOSB;
	String END_OF_PACKAGE1 = EOP1 + EOP4;
	String END_OF_PACKAGE2 = EOP2 + EOP5;
	String END_OF_PACKAGE3 = EOP3;
	String END_OF_PACKAGE1_INV = EOP4 + EOP1;
	String END_OF_PACKAGE2_INV = Util.invertCode(EOP2) + Util.invertCode(EOP5);
	String END_OF_PACKAGE3_INV = Util.invertCode(EOP3);

}
