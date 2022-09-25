package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.n */
/* compiled from: PG */
public final /* synthetic */ class C16815n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C16820s f49247a;

    public /* synthetic */ C16815n(C16820s sVar) {
        this.f49247a = sVar;
    }

    public final void accept(Object obj) {
        C16820s sVar = this.f49247a;
        String str = (String) obj;
        ViewGroup viewGroup = (ViewGroup) sVar.f49254c.findViewById(R.id.app_actions_header);
        if (viewGroup == null) {
            viewGroup = (ViewGroup) ((ViewStub) sVar.f49254c.findViewById(R.id.app_actions_header_stub)).inflate();
        }
        viewGroup.setVisibility(0);
        try {
            ((ImageView) viewGroup.findViewById(R.id.image)).setImageDrawable(sVar.f49254c.getContext().getPackageManager().getApplicationIcon(sVar.f49255d.f134916c));
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) C16820s.f49252a.mo56226d()).mo56382g(e)).mo56372aa(46893)).mo56386p("logo not provided by the app");
        }
        ((TextView) viewGroup.findViewById(R.id.text)).setText(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
