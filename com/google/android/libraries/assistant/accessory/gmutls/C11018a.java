package com.google.android.libraries.assistant.accessory.gmutls;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.a */
/* compiled from: PG */
public final class C11018a extends ArrayList {

    /* renamed from: a */
    private int f36207a;

    private C11018a() {
        this.f36207a = 0;
    }

    /* renamed from: a */
    public final int mo19465a() {
        return Math.max(this.f36207a, size());
    }

    /* renamed from: b */
    public final ByteBuffer mo19466b() {
        byte[] bArr;
        if (isEmpty()) {
            bArr = new byte[mo19465a()];
        } else {
            bArr = new byte[size()];
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            bArr[i2] = ((Byte) get(i)).byteValue();
            i++;
            i2++;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    /* renamed from: c */
    public final void mo19467c(ByteBuffer byteBuffer, int i) {
        clear();
        int min = Math.min(i, byteBuffer.limit());
        for (int i2 = 0; i2 < min; i2++) {
            add(i2, Byte.valueOf(byteBuffer.get(i2)));
        }
    }

    /* renamed from: d */
    public final byte[] mo19468d() {
        byte[] bArr = new byte[size()];
        int size = size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            bArr[i2] = ((Byte) get(i)).byteValue();
            i++;
            i2++;
        }
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format(Locale.ENGLISH, "0x%02X", new Object[]{get(i)}));
            if (i != size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(String.format(Locale.ENGLISH, " - %d bytes", new Object[]{Integer.valueOf(size())}));
        return sb.toString();
    }

    public C11018a(int i) {
        super(i);
        this.f36207a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11018a(byte[] bArr) {
        super(bArr == null ? 0 : bArr.length);
        this.f36207a = 0;
        if (bArr != null) {
            for (byte valueOf : bArr) {
                add(Byte.valueOf(valueOf));
            }
            this.f36207a = bArr.length;
        }
    }
}
