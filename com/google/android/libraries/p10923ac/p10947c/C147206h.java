package com.google.android.libraries.p10923ac.p10947c;

import com.google.protobuf.C62917ay;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import com.google.protos.p4881ar.p4882a.C63771b;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.libraries.ac.c.h */
/* compiled from: PG */
public final class C147206h {

    /* renamed from: a */
    public final long f397422a;

    /* renamed from: b */
    private final byte[] f397423b;

    /* renamed from: c */
    private final byte[] f397424c;

    /* renamed from: d */
    private final C62917ay f397425d;

    public C147206h(byte[] bArr, byte[] bArr2, long j, C62917ay ayVar) {
        this.f397423b = bArr;
        this.f397424c = bArr2;
        this.f397422a = j;
        this.f397425d = ayVar;
    }

    /* renamed from: a */
    public final MessageLite mo124033a() {
        Object obj;
        C62921ba baVar = new C62921ba();
        baVar.mo58831d(this.f397425d);
        C63771b bVar = (C63771b) C62942bv.parseFrom((C62942bv) C63771b.f172510a, this.f397423b, baVar);
        C62940bt r1 = C62942bv.checkIsLite(this.f397425d);
        bVar.mo58887l(r1);
        if (bVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(this.f397425d);
            bVar.mo58887l(r12);
            Object l = bVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            return (MessageLite) obj;
        }
        throw new C62974ct("Missing MessageSet extension");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C147206h hVar = (C147206h) obj;
            if (Arrays.equals(this.f397423b, hVar.f397423b) && Arrays.equals(this.f397424c, hVar.f397424c) && this.f397422a == hVar.f397422a) {
                C62917ay ayVar = this.f397425d;
                int i = ayVar == null ? 0 : ((C62940bt) ayVar).f169971d.f169964b;
                C62917ay ayVar2 = hVar.f397425d;
                if (i == (ayVar2 == null ? 0 : ((C62940bt) ayVar2).f169971d.f169964b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((Arrays.hashCode(this.f397423b) + 527) * 31) + Arrays.hashCode(this.f397424c)) * 31) + Long.valueOf(this.f397422a).hashCode()) * 31;
        C62917ay ayVar = this.f397425d;
        if (ayVar == null) {
            i = 0;
        } else {
            i = ((C62940bt) ayVar).f169971d.f169964b;
        }
        return hashCode + Integer.valueOf(i).hashCode();
    }

    public final String toString() {
        String str;
        try {
            str = "{" + String.valueOf(mo124033a()) + "}";
        } catch (C62974ct e) {
            str = e.getMessage();
        }
        return String.format(Locale.ENGLISH, "MdhFootprint{data=%s, secondaryId=%s, serverEventIdTimestamp=%d}", new Object[]{str, Arrays.toString(this.f397424c), Long.valueOf(this.f397422a)});
    }
}
