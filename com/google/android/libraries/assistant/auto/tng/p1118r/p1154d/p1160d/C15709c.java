package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67105lf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.c */
/* compiled from: PG */
final class C15709c extends C15705am {

    /* renamed from: a */
    public final C67105lf f46873a;

    /* renamed from: b */
    public final C67087ko f46874b;

    public C15709c(C67105lf lfVar, C67087ko koVar) {
        if (lfVar != null) {
            this.f46873a = lfVar;
            if (koVar != null) {
                this.f46874b = koVar;
                return;
            }
            throw new NullPointerException("Null initResponse");
        }
        throw new NullPointerException("Null initRequest");
    }

    /* renamed from: a */
    public final C67087ko mo22514a() {
        return this.f46874b;
    }

    /* renamed from: b */
    public final C67105lf mo22515b() {
        return this.f46873a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15705am) {
            C15705am amVar = (C15705am) obj;
            return this.f46873a.equals(amVar.mo22515b()) && this.f46874b.equals(amVar.mo22514a());
        }
    }

    public final int hashCode() {
        return ((this.f46873a.hashCode() ^ 1000003) * 1000003) ^ this.f46874b.hashCode();
    }

    public final String toString() {
        String obj = this.f46873a.toString();
        String obj2 = this.f46874b.toString();
        return "SodaInitRequestResponseStore{initRequest=" + obj + ", initResponse=" + obj2 + "}";
    }
}
