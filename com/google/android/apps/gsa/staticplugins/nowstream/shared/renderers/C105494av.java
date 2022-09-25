package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.text.TextUtils;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.av */
/* compiled from: PG */
public final /* synthetic */ class C105494av implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105495aw f294290a;

    public /* synthetic */ C105494av(C105495aw awVar) {
        this.f294290a = awVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105495aw awVar = this.f294290a;
        String str = (String) obj;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z = !isEmpty;
        awVar.f294293c.setVisibility(true != isEmpty ? 0 : 8);
        awVar.f294292b.mo76748f(z);
        awVar.f294292b.mo76751i(z ? 2 : 6);
        TextView textView = awVar.f294294d;
        if (true != z) {
            str = BuildConfig.FLAVOR;
        }
        textView.setText(str);
    }
}
