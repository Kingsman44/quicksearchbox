package com.google.android.apps.gsa.settingsui;

import android.widget.ListView;
import java.util.TimerTask;

/* renamed from: com.google.android.apps.gsa.settingsui.l */
/* compiled from: PG */
final class C88997l extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ ListView f241174a;

    /* renamed from: b */
    final /* synthetic */ int f241175b;

    public C88997l(ListView listView, int i) {
        this.f241174a = listView;
        this.f241175b = i;
    }

    public final void run() {
        this.f241174a.smoothScrollToPosition(this.f241175b);
    }
}
