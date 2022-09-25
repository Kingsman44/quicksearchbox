package com.google.android.gms.cast;

/* renamed from: com.google.android.gms.cast.ai */
/* compiled from: PG */
public final /* synthetic */ class C143351ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143353ak f388770a;

    /* renamed from: b */
    public final /* synthetic */ String f388771b;

    /* renamed from: c */
    public final /* synthetic */ String f388772c;

    public /* synthetic */ C143351ai(C143353ak akVar, String str, String str2) {
        this.f388770a = akVar;
        this.f388771b = str;
        this.f388772c = str2;
    }

    public final void run() {
        C143558i iVar;
        C143353ak akVar = this.f388770a;
        String str = this.f388771b;
        String str2 = this.f388772c;
        synchronized (akVar.f388775a.f388797s) {
            iVar = (C143558i) akVar.f388775a.f388797s.get(str);
        }
        if (iVar != null) {
            iVar.mo118773a(str2);
            return;
        }
        C143354al.f388778a.mo118884b("Discarded message for unknown namespace '%s'", str);
    }
}
