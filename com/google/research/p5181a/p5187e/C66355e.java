package com.google.research.p5181a.p5187e;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66294q;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.research.a.e.e */
/* compiled from: PG */
public final class C66355e {

    /* renamed from: b */
    private static final long f180432b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    public final C66278a f180433a = new C66278a(1000, false);

    /* renamed from: c */
    private final long f180434c = f180432b;

    /* renamed from: a */
    public static C66355e m97089a(byte[] bArr, C66376a aVar) {
        C66355e eVar = new C66355e();
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            eVar.f180433a.mo59450c();
            int readInt = dataInputStream.readInt();
            byte[] bArr2 = null;
            for (int i = 0; i < readInt; i++) {
                int readInt2 = dataInputStream.readInt();
                if (bArr2 == null || bArr2.length < readInt2) {
                    bArr2 = new byte[readInt2];
                }
                dataInputStream.read(bArr2, 0, readInt2);
                eVar.mo59583b(aVar.mo59468k(bArr2, readInt2));
            }
            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eVar;
    }

    /* renamed from: c */
    public static byte[] m97090c(C66355e eVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            int i = eVar.f180433a.f180248b;
            dataOutputStream.writeInt(i);
            for (int i2 = 0; i2 < i; i2++) {
                byte[] e = ((C66376a) eVar.f180433a.mo59448a(i2)).mo59462e();
                int length = e.length;
                dataOutputStream.writeInt(length);
                dataOutputStream.write(e, 0, length);
            }
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void mo59583b(C66376a aVar) {
        while (true) {
            C66278a aVar2 = this.f180433a;
            if (aVar2.f180248b <= 0 || C66294q.m96858a((C66376a) aVar2.mo59448a(0), aVar) <= this.f180434c) {
                this.f180433a.mo59452e(aVar);
            } else {
                C66278a aVar3 = this.f180433a;
                int i = aVar3.f180248b;
                if (i != 0) {
                    int i2 = aVar3.f180247a - (i - 1);
                    if (i2 < 0) {
                        i2 += aVar3.f180249c.length;
                    }
                    if (aVar3.mo59451d()) {
                        aVar3.f180250d.add(aVar3.f180249c[i2]);
                    }
                    aVar3.f180249c[i2] = null;
                    aVar3.f180248b--;
                    aVar3.f180251e--;
                }
            }
        }
        this.f180433a.mo59452e(aVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(size ");
        sb.append(this.f180433a.f180248b);
        sb.append("): ");
        int i = 0;
        while (true) {
            C66278a aVar = this.f180433a;
            if (i < aVar.f180248b) {
                sb.append(((C66376a) aVar.mo59448a(i)).mo59460c());
                sb.append(" ");
                i++;
            } else {
                sb.append("\n");
                return sb.toString();
            }
        }
    }
}
