package com.google.android.libraries.lens.view.session.ondevice.p2168c;

import com.google.lens.p4699e.C62218bd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.c.b */
/* compiled from: PG */
public final class C27928b extends C27943q {

    /* renamed from: a */
    private final C56233an f76080a;

    /* renamed from: b */
    private final C62218bd f76081b;

    /* renamed from: c */
    private final String f76082c;

    public C27928b(C56233an anVar, C62218bd bdVar, String str) {
        if (anVar != null) {
            this.f76080a = anVar;
            if (bdVar != null) {
                this.f76081b = bdVar;
                if (str != null) {
                    this.f76082c = str;
                    return;
                }
                throw new NullPointerException("Null utf8String");
            }
            throw new NullPointerException("Null textStyle");
        }
        throw new NullPointerException("Null line");
    }

    /* renamed from: a */
    public final C62218bd mo33406a() {
        return this.f76081b;
    }

    /* renamed from: b */
    public final C56233an mo33407b() {
        return this.f76080a;
    }

    /* renamed from: c */
    public final String mo33408c() {
        return this.f76082c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27943q) {
            C27943q qVar = (C27943q) obj;
            return this.f76080a.equals(qVar.mo33407b()) && this.f76081b.equals(qVar.mo33406a()) && this.f76082c.equals(qVar.mo33408c());
        }
    }

    public final int hashCode() {
        return ((((this.f76080a.hashCode() ^ 1000003) * 1000003) ^ this.f76081b.hashCode()) * 1000003) ^ this.f76082c.hashCode();
    }

    public final String toString() {
        String obj = this.f76080a.toString();
        String obj2 = this.f76081b.toString();
        String str = this.f76082c;
        return "WrappedLine{line=" + obj + ", textStyle=" + obj2 + ", utf8String=" + str + "}";
    }
}
