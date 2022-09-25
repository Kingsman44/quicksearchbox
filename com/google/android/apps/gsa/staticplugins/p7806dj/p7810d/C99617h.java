package com.google.android.apps.gsa.staticplugins.p7806dj.p7810d;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99606a;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99607b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.d.h */
/* compiled from: PG */
final class C99617h implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C99619j f278765a;

    public C99617h(C99619j jVar) {
        this.f278765a = jVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C99619j jVar = this.f278765a;
        if (jVar.f278768b.f278756a.f278725a.size() > i) {
            String str = ((C99596c) jVar.f278768b.f278756a.f278725a.get(i)).f278719b;
            String str2 = ((C99596c) jVar.f278768b.f278756a.f278725a.get(i)).f278721d;
            C99606a aVar = jVar.f278767a;
            Bundle bundle = new Bundle();
            bundle.putString("preferenceName", str);
            bundle.putString("filePath", str2);
            ((C99607b) aVar).f278751a.mo28345s("onSearchResultClicked_java.lang.String_java.lang.String", "SettingsSearchEventsDispatcher", bundle);
        }
    }
}
