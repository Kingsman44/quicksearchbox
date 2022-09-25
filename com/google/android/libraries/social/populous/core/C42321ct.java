package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.ct */
/* compiled from: PG */
public abstract class C42321ct implements Comparable {
    /* renamed from: a */
    public abstract C42320cs mo45203a();

    /* renamed from: b */
    public abstract String mo45204b();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C42321ct ctVar = (C42321ct) obj;
        if (ctVar == null) {
            return -1;
        }
        int compareTo = mo45203a().compareTo(ctVar.mo45203a());
        if (compareTo != 0) {
            return compareTo;
        }
        return mo45204b().compareTo(ctVar.mo45204b());
    }
}
