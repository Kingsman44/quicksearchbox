package androidx.camera.core.p069a.p070a;

import androidx.core.p097i.C1974i;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.camera.core.a.a.l */
/* compiled from: PG */
public final class C1281l extends FilterOutputStream {

    /* renamed from: a */
    private static final byte[] f3707a = "Exif\u0000\u0000".getBytes(C1275f.f3681a);

    /* renamed from: b */
    private final C1280k f3708b;

    /* renamed from: c */
    private final byte[] f3709c = new byte[1];

    /* renamed from: d */
    private final ByteBuffer f3710d = ByteBuffer.allocate(4);

    /* renamed from: e */
    private int f3711e = 0;

    /* renamed from: f */
    private int f3712f;

    /* renamed from: g */
    private int f3713g;

    public C1281l(OutputStream outputStream, C1280k kVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f3708b = kVar;
    }

    /* renamed from: a */
    private final int m3460a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f3710d.position());
        this.f3710d.put(bArr, i2, min);
        return min;
    }

    public final void write(int i) {
        byte[] bArr = this.f3709c;
        bArr[0] = (byte) (i & PrivateKeyType.INVALID);
        int length = bArr.length;
        write(bArr, 0, 1);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.f3712f;
            if ((i5 > 0 || this.f3713g > 0 || this.f3711e != 2) && i4 > 0) {
                if (i5 > 0) {
                    int min = Math.min(i4, i5);
                    i4 -= min;
                    this.f3712f -= min;
                    i3 += min;
                }
                int i6 = this.f3713g;
                if (i6 > 0) {
                    int min2 = Math.min(i4, i6);
                    this.out.write(bArr2, i3, min2);
                    i4 -= min2;
                    this.f3713g -= min2;
                    i3 += min2;
                }
                if (i4 != 0) {
                    int i7 = this.f3711e;
                    int i8 = 4;
                    if (i7 == 0) {
                        int a = m3460a(2, bArr2, i3, i4);
                        i3 += a;
                        i4 -= a;
                        if (this.f3710d.position() >= 2) {
                            this.f3710d.rewind();
                            if (this.f3710d.getShort() == -40) {
                                this.out.write(this.f3710d.array(), 0, 2);
                                this.f3711e = 1;
                                this.f3710d.rewind();
                                C1237a aVar = new C1237a(this.out, ByteOrder.BIG_ENDIAN);
                                aVar.mo4069b(-31);
                                int i9 = C1280k.f3700e;
                                int[] iArr = new int[4];
                                int[] iArr2 = new int[4];
                                C1282m[] mVarArr = C1280k.f3697a;
                                int i10 = 0;
                                while (i10 < i8) {
                                    C1282m mVar = mVarArr[i10];
                                    int i11 = 0;
                                    while (i11 < i8) {
                                        this.f3708b.mo4144a(i11).remove(mVar.f3715b);
                                        i11++;
                                        i8 = 4;
                                    }
                                    i10++;
                                    i8 = 4;
                                }
                                if (!this.f3708b.mo4144a(1).isEmpty()) {
                                    this.f3708b.mo4144a(0).put(C1280k.f3697a[1].f3715b, C1275f.m3450d(0, this.f3708b.f3705d));
                                }
                                if (!this.f3708b.mo4144a(2).isEmpty()) {
                                    this.f3708b.mo4144a(0).put(C1280k.f3697a[2].f3715b, C1275f.m3450d(0, this.f3708b.f3705d));
                                }
                                if (!this.f3708b.mo4144a(3).isEmpty()) {
                                    this.f3708b.mo4144a(1).put(C1280k.f3697a[3].f3715b, C1275f.m3450d(0, this.f3708b.f3705d));
                                }
                                for (int i12 = 0; i12 < 4; i12++) {
                                    int i13 = 0;
                                    for (Map.Entry value : this.f3708b.mo4144a(i12).entrySet()) {
                                        int a2 = ((C1275f) value.getValue()).mo4131a();
                                        if (a2 > 4) {
                                            i13 += a2;
                                        }
                                    }
                                    iArr2[i12] = iArr2[i12] + i13;
                                }
                                int i14 = 8;
                                for (int i15 = 0; i15 < 4; i15++) {
                                    if (!this.f3708b.mo4144a(i15).isEmpty()) {
                                        iArr[i15] = i14;
                                        i14 += (this.f3708b.mo4144a(i15).size() * 12) + 6 + iArr2[i15];
                                    }
                                }
                                int i16 = i14 + 8;
                                if (!this.f3708b.mo4144a(1).isEmpty()) {
                                    this.f3708b.mo4144a(0).put(C1280k.f3697a[1].f3715b, C1275f.m3450d((long) iArr[1], this.f3708b.f3705d));
                                }
                                if (!this.f3708b.mo4144a(2).isEmpty()) {
                                    this.f3708b.mo4144a(0).put(C1280k.f3697a[2].f3715b, C1275f.m3450d((long) iArr[2], this.f3708b.f3705d));
                                }
                                if (!this.f3708b.mo4144a(3).isEmpty()) {
                                    this.f3708b.mo4144a(1).put(C1280k.f3697a[3].f3715b, C1275f.m3450d((long) iArr[3], this.f3708b.f3705d));
                                }
                                aVar.mo4070c(i16);
                                aVar.f3626a.write(f3707a);
                                aVar.mo4069b(this.f3708b.f3705d == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
                                aVar.f3627b = this.f3708b.f3705d;
                                aVar.mo4070c(42);
                                aVar.mo4068a(8);
                                for (int i17 = 0; i17 < 4; i17++) {
                                    if (!this.f3708b.mo4144a(i17).isEmpty()) {
                                        aVar.mo4070c(this.f3708b.mo4144a(i17).size());
                                        int size = iArr[i17] + 2 + (this.f3708b.mo4144a(i17).size() * 12) + 4;
                                        for (Map.Entry entry : this.f3708b.mo4144a(i17).entrySet()) {
                                            C1282m mVar2 = (C1282m) ((HashMap) C1279j.f3691a.get(i17)).get(entry.getKey());
                                            C1974i.m5319g(mVar2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                            int i18 = mVar2.f3714a;
                                            C1275f fVar = (C1275f) entry.getValue();
                                            int a3 = fVar.mo4131a();
                                            aVar.mo4070c(i18);
                                            aVar.mo4070c(fVar.f3684d);
                                            aVar.mo4068a(fVar.f3685e);
                                            if (a3 > 4) {
                                                aVar.mo4068a((int) ((long) size));
                                                size += a3;
                                            } else {
                                                aVar.f3626a.write(fVar.f3686f);
                                                if (a3 < 4) {
                                                    for (int i19 = 4; a3 < i19; i19 = 4) {
                                                        aVar.f3626a.write(0);
                                                        a3++;
                                                    }
                                                }
                                            }
                                        }
                                        aVar.mo4068a(0);
                                        for (Map.Entry value2 : this.f3708b.mo4144a(i17).entrySet()) {
                                            byte[] bArr3 = ((C1275f) value2.getValue()).f3686f;
                                            int length = bArr3.length;
                                            if (length > 4) {
                                                aVar.f3626a.write(bArr3, 0, length);
                                            }
                                        }
                                    }
                                }
                                aVar.f3627b = ByteOrder.BIG_ENDIAN;
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    } else if (i7 != 1) {
                        continue;
                    } else {
                        int a4 = m3460a(4, bArr2, i3, i4);
                        i3 += a4;
                        i4 -= a4;
                        if (this.f3710d.position() == 2 && this.f3710d.getShort() == -39) {
                            this.out.write(this.f3710d.array(), 0, 2);
                            this.f3710d.rewind();
                        }
                        if (this.f3710d.position() >= 4) {
                            this.f3710d.rewind();
                            short s = this.f3710d.getShort();
                            if (s == -31) {
                                this.f3712f = ((char) this.f3710d.getShort()) - 2;
                                this.f3711e = 2;
                            } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                                this.out.write(this.f3710d.array(), 0, 4);
                                this.f3713g = ((char) this.f3710d.getShort()) - 2;
                            } else {
                                this.out.write(this.f3710d.array(), 0, 4);
                                this.f3711e = 2;
                            }
                            this.f3710d.rewind();
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (i4 > 0) {
            this.out.write(bArr2, i3, i4);
        }
    }
}
