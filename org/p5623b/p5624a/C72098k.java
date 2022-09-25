package org.p5623b.p5624a;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.chromium.net.PrivateKeyType;
import org.p5623b.p5629b.p5631b.C72124a;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: org.b.a.k */
/* compiled from: PG */
public final class C72098k extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final int f191924a;

    /* renamed from: b */
    private final boolean f191925b;

    /* renamed from: c */
    private final byte[][] f191926c = new byte[11][];

    public C72098k(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f191924a = i;
        this.f191925b = z;
    }

    /* renamed from: a */
    static int m105574a(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i2 = read & 127;
            if (i2 <= 4) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < i2) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i3 = (i3 << 8) + read2;
                        i4++;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i3 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i3 < i || z) {
                    return i3;
                } else {
                    throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
                }
            } else {
                throw new IOException("DER length more than 4 bytes: " + i2);
            }
        }
    }

    /* renamed from: b */
    static int m105575b(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if ((read & 127) != 0) {
            int i3 = 0;
            while (read >= 0 && (read & 128) != 0) {
                i3 = ((read & 127) | i3) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    /* renamed from: e */
    static final C72093f m105577e(C72083ca caVar) {
        if (caVar.f191898a <= 0) {
            return new C72093f(0);
        }
        C72098k kVar = new C72098k(caVar, C72090ch.m105546c(caVar), false);
        C72093f fVar = new C72093f(10);
        while (true) {
            C72108u d = kVar.mo63286d();
            if (d == null) {
                return fVar;
            }
            fVar.mo63279b(d);
        }
    }

    /* renamed from: f */
    private static byte[] m105578f(C72083ca caVar, byte[][] bArr) {
        int i = caVar.f191898a;
        int length = bArr.length;
        if (i >= 11) {
            return caVar.mo63264a();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        C72124a.m105661a(caVar, bArr2, bArr2.length);
        return bArr2;
    }

    /* renamed from: d */
    public final C72108u mo63286d() {
        int read = read();
        if (read > 0) {
            int b = m105575b(this, read);
            int i = read & 32;
            int i2 = 0;
            int a = m105574a(this, this.f191924a, false);
            boolean z = true;
            if (a >= 0) {
                if (i == 0) {
                    z = false;
                }
                try {
                    C72083ca caVar = new C72083ca(this, a, this.f191924a);
                    if ((read & 64) != 0) {
                        return new C72064bq(z, b, caVar.mo63264a());
                    }
                    if ((read & 128) != 0) {
                        return new C72016ab(caVar, C72090ch.m105546c(caVar)).mo63225c(z, b);
                    }
                    if (!z) {
                        return m105576c(b, caVar, this.f191926c);
                    }
                    if (b == 4) {
                        C72093f e = m105577e(caVar);
                        int i3 = e.f191912b;
                        C72104q[] qVarArr = new C72104q[i3];
                        while (i2 != i3) {
                            C72092e a2 = e.mo63278a(i2);
                            if (a2 instanceof C72104q) {
                                qVarArr[i2] = (C72104q) a2;
                                i2++;
                            } else {
                                throw new C72095h("unknown object encountered in constructed OCTET STRING: ".concat(String.valueOf(String.valueOf(a2.getClass()))));
                            }
                        }
                        return new C72024aj(qVarArr);
                    } else if (b == 8) {
                        return new C72066bs(m105577e(caVar));
                    } else {
                        if (b != 16) {
                            if (b == 17) {
                                C72093f e2 = m105577e(caVar);
                                if (e2.f191912b <= 0) {
                                    return C72067bt.f191863b;
                                }
                                return new C72071bx(e2);
                            }
                            throw new IOException("unknown tag " + b + " encountered");
                        } else if (this.f191925b) {
                            return new C72087ce(caVar.mo63264a());
                        } else {
                            return C72067bt.m105495a(m105577e(caVar));
                        }
                    }
                } catch (IllegalArgumentException e3) {
                    throw new C72095h("corrupted stream detected", e3);
                }
            } else if (i != 0) {
                C72016ab abVar = new C72016ab(new C72085cc(this, this.f191924a), this.f191924a);
                if ((read & 64) != 0) {
                    return new C72021ag(b, abVar).mo63230j();
                }
                if ((read & 128) != 0) {
                    return new C72031aq(true, b, abVar).mo63230j();
                }
                if (b == 4) {
                    return new C72025ak(abVar).mo63230j();
                }
                if (b == 8) {
                    return new C72036av(abVar).mo63230j();
                }
                if (b == 16) {
                    return new C72027am(abVar).mo63230j();
                }
                if (b == 17) {
                    return new C72029ao(abVar).mo63230j();
                }
                throw new IOException("unknown BER object encountered");
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* renamed from: c */
    static C72108u m105576c(int i, C72083ca caVar, byte[][] bArr) {
        int i2;
        int i3 = 0;
        if (i == 10) {
            byte[] f = m105578f(caVar, bArr);
            int length = f.length;
            if (length > 1) {
                return new C72094g(f);
            }
            if (length != 0) {
                byte b = f[0] & 255;
                C72094g[] gVarArr = C72094g.f191915a;
                if (b >= 12) {
                    return new C72094g(f);
                }
                C72094g gVar = gVarArr[b];
                if (gVar != null) {
                    return gVar;
                }
                C72094g gVar2 = new C72094g(f);
                gVarArr[b] = gVar2;
                return gVar2;
            }
            throw new IllegalArgumentException("ENUMERATED has zero length");
        } else if (i == 12) {
            return new C72060bm(caVar.mo63264a());
        } else {
            if (i != 30) {
                switch (i) {
                    case 1:
                        byte[] f2 = m105578f(caVar, bArr);
                        if (f2.length == 1) {
                            byte b2 = f2[0];
                            if (b2 != -1) {
                                return b2 != 0 ? new C72074c(b2) : C72074c.f191866a;
                            }
                            return C72074c.f191867b;
                        }
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    case 2:
                        return new C72099l(caVar.mo63264a());
                    case 3:
                        int i4 = caVar.f191898a;
                        int i5 = C72041b.f191796c;
                        if (i4 > 0) {
                            int read = caVar.read();
                            int i6 = i4 - 1;
                            byte[] bArr2 = new byte[i6];
                            if (i6 != 0) {
                                if (C72124a.m105661a(caVar, bArr2, i6) != i6) {
                                    throw new EOFException("EOF encountered in middle of BIT STRING");
                                } else if (read > 0 && read < 8) {
                                    byte b3 = bArr2[i6 - 1];
                                    if (b3 != ((byte) ((PrivateKeyType.INVALID << read) & b3))) {
                                        return new C72065br(bArr2, read);
                                    }
                                }
                            }
                            return new C72034at(bArr2, read);
                        }
                        throw new IllegalArgumentException("truncated BIT STRING detected");
                    case 4:
                        return new C72050bc(caVar.mo63264a());
                    case 5:
                        return C72048ba.f191847a;
                    case 6:
                        return C72103p.m105595e(m105578f(caVar, bArr));
                    default:
                        switch (i) {
                            case 18:
                                return new C72049bb(caVar.mo63264a());
                            case 19:
                                return new C72053bf(caVar.mo63264a());
                            case 20:
                                return new C72058bk(caVar.mo63264a());
                            case 21:
                                return new C72062bo(caVar.mo63264a());
                            case 22:
                                return new C72040az(caVar.mo63264a());
                            case 23:
                                return new C72019ae(caVar.mo63264a());
                            case 24:
                                return new C72097j(caVar.mo63264a());
                            case 25:
                                return new C72039ay(caVar.mo63264a());
                            case 26:
                                return new C72063bp(caVar.mo63264a());
                            case 27:
                                return new C72037aw(caVar.mo63264a());
                            case 28:
                                return new C72061bn(caVar.mo63264a());
                            default:
                                throw new IOException("unknown tag " + i + " encountered");
                        }
                }
            } else {
                int i7 = caVar.f191898a;
                if ((i7 & 1) == 0) {
                    int i8 = i7 / 2;
                    char[] cArr = new char[i8];
                    byte[] bArr3 = new byte[8];
                    int i9 = 0;
                    while (i7 >= 8) {
                        if (C72124a.m105661a(caVar, bArr3, 8) == 8) {
                            cArr[i9] = (char) ((bArr3[0] << 8) | (bArr3[1] & 255));
                            cArr[i9 + 1] = (char) ((bArr3[2] << 8) | (bArr3[3] & 255));
                            cArr[i9 + 2] = (char) ((bArr3[4] << 8) | (bArr3[5] & 255));
                            cArr[i9 + 3] = (char) ((bArr3[6] << 8) | (bArr3[7] & 255));
                            i9 += 4;
                            i7 -= 8;
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (i7 > 0) {
                        if (C72124a.m105661a(caVar, bArr3, i7) == i7) {
                            while (true) {
                                int i10 = i3 + 1;
                                int i11 = i10 + 1;
                                i2 = i9 + 1;
                                cArr[i9] = (char) ((bArr3[i3] << 8) | (bArr3[i10] & 255));
                                if (i11 >= i7) {
                                    break;
                                }
                                i3 = i11;
                                i9 = i2;
                            }
                            i9 = i2;
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (caVar.f191898a == 0 && i8 == i9) {
                        return new C72033as(cArr);
                    }
                    throw new IllegalStateException();
                }
                throw new IOException("malformed BMPString encoding encountered");
            }
        }
    }
}
