package com.google.apps.tiktok.contrib.work;

import androidx.work.C4634o;

/* renamed from: com.google.apps.tiktok.contrib.work.h */
/* compiled from: PG */
public final class C46574h extends C46585s {

    /* renamed from: a */
    private final String f121772a;

    /* renamed from: b */
    private final C4634o f121773b;

    public C46574h(String str, C4634o oVar) {
        if (str != null) {
            this.f121772a = str;
            if (oVar != null) {
                this.f121773b = oVar;
                return;
            }
            throw new NullPointerException("Null existingWorkPolicy");
        }
        throw new NullPointerException("Null uniquenessKey");
    }

    /* renamed from: a */
    public final C4634o mo50586a() {
        return this.f121773b;
    }

    /* renamed from: b */
    public final String mo50587b() {
        return this.f121772a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46585s) {
            C46585s sVar = (C46585s) obj;
            return this.f121772a.equals(sVar.mo50587b()) && this.f121773b.equals(sVar.mo50586a());
        }
    }

    public final int hashCode() {
        return ((this.f121772a.hashCode() ^ 1000003) * 1000003) ^ this.f121773b.hashCode();
    }

    public final String toString() {
        String str = this.f121772a;
        String obj = this.f121773b.toString();
        return "UniqueWorkSpec{uniquenessKey=" + str + ", existingWorkPolicy=" + obj + "}";
    }
}
