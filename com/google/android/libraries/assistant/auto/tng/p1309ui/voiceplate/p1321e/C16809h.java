package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.h */
/* compiled from: PG */
public final /* synthetic */ class C16809h implements C16812k {

    /* renamed from: a */
    public final /* synthetic */ C16813l f49223a;

    public /* synthetic */ C16809h(C16813l lVar) {
        this.f49223a = lVar;
    }

    /* renamed from: a */
    public final void mo23031a() {
        C16813l lVar = this.f49223a;
        int childCount = lVar.f49227b.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            if (lVar.f49227b.getChildAt(childCount).getVisibility() == 8) {
                lVar.f49227b.removeViewAt(childCount);
            }
        }
    }
}
