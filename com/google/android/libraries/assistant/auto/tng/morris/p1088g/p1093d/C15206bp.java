package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14580om;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.bp */
/* compiled from: PG */
public final class C15206bp {

    /* renamed from: a */
    public final C14986h f45641a;

    /* renamed from: b */
    public C60872cz f45642b;

    /* renamed from: c */
    private final C15352z f45643c;

    /* renamed from: d */
    private final C14132bf f45644d;

    /* renamed from: e */
    private final C60888db f45645e;

    /* renamed from: f */
    private final C86124t f45646f;

    /* renamed from: g */
    private TextView f45647g;

    /* renamed from: h */
    private TextView f45648h;

    /* renamed from: i */
    private ImageView f45649i;

    /* renamed from: j */
    private ImageView f45650j;

    /* renamed from: k */
    private Button f45651k;

    /* renamed from: l */
    private C14584oq f45652l;

    public C15206bp(C14986h hVar, C15352z zVar, C14132bf bfVar, C86124t tVar, C60888db dbVar) {
        this.f45641a = hVar;
        this.f45643c = zVar;
        this.f45644d = bfVar;
        this.f45646f = tVar;
        this.f45645e = dbVar;
        mo22080b();
    }

    /* renamed from: b */
    public final void mo22080b() {
        this.f45647g = null;
        this.f45648h = null;
        this.f45649i = null;
        this.f45650j = null;
        this.f45652l = null;
    }

    /* renamed from: c */
    public final void mo22081c() {
        C60872cz czVar = this.f45642b;
        if (czVar != null && !czVar.isDone()) {
            this.f45642b.cancel(true);
        }
        this.f45642b = null;
        C14986h hVar = this.f45641a;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14426iu iuVar = (C14426iu) C14427iv.f43643o.createBuilder();
        iuVar.copyOnWrite();
        ((C14427iv) iuVar.instance).f43645a = 6;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14427iv ivVar = (C14427iv) iuVar.build();
        ivVar.getClass();
        lfVar.f43801d = ivVar;
        lfVar.f43800c = 5;
        hVar.mo21875g((C14492lf) gtVar.build());
    }

    /* renamed from: a */
    public final void mo22079a(C14584oq oqVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (this.f45647g == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(true != oqVar.f44097e ? R.layout.message_reply : R.layout.message_reply_large, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.message_reply_container);
            this.f45644d.mo21444a(viewGroup2, 114349);
            viewGroup2.getClass();
            this.f45651k = (Button) viewGroup2.findViewById(R.id.reply_button);
            this.f45647g = (TextView) viewGroup2.findViewById(R.id.message_receiver_name);
            this.f45648h = (TextView) viewGroup2.findViewById(R.id.message_app_name);
            this.f45649i = (ImageView) viewGroup2.findViewById(R.id.message_receiver_avatar);
            this.f45650j = (ImageView) viewGroup2.findViewById(R.id.message_app_icon);
        }
        if (!oqVar.equals(this.f45652l)) {
            C14348fx fxVar = oqVar.f44093a;
            if (fxVar != null) {
                TextView textView = this.f45647g;
                textView.getClass();
                textView.setText(fxVar.f43416a);
                TextView textView2 = this.f45648h;
                textView2.getClass();
                textView2.setText(this.f45643c.mo22227h(fxVar.f43418c));
                C15352z zVar = this.f45643c;
                ImageView imageView = this.f45649i;
                imageView.getClass();
                C14361gj gjVar = fxVar.f43419d;
                if (gjVar == null) {
                    gjVar = C14361gj.f43456e;
                }
                zVar.mo22229l(imageView, gjVar, C15205bo.f45640a);
                C15352z zVar2 = this.f45643c;
                ImageView imageView2 = this.f45650j;
                imageView2.getClass();
                zVar2.mo22228k(imageView2, fxVar.f43418c);
            } else {
                C14580om omVar = oqVar.f44094b;
                if (omVar == null) {
                    omVar = C14580om.f44082d;
                }
                TextView textView3 = this.f45647g;
                textView3.getClass();
                textView3.setText(omVar.f44084a);
                TextView textView4 = this.f45648h;
                textView4.getClass();
                textView4.setText(this.f45643c.mo22227h(omVar.f44086c));
                C15352z zVar3 = this.f45643c;
                ImageView imageView3 = this.f45649i;
                imageView3.getClass();
                zVar3.mo22232o(imageView3, omVar.f44085b, C15205bo.f45640a, C5593j.m14518b());
                C15352z zVar4 = this.f45643c;
                ImageView imageView4 = this.f45650j;
                imageView4.getClass();
                zVar4.mo22228k(imageView4, omVar.f44086c);
            }
            int i = oqVar.f44095c;
            if (i != 0) {
                C14132bf bfVar = this.f45644d;
                Button button = this.f45651k;
                button.getClass();
                bfVar.mo21444a(button, i);
                Button button2 = this.f45651k;
                button2.getClass();
                button2.setOnClickListener(new C14129bc(this.f45644d, Optional.empty(), new C15202bl(this)));
            } else {
                Button button3 = this.f45651k;
                button3.getClass();
                button3.setOnClickListener(new C15203bm(this));
            }
            if (oqVar.f44096d) {
                this.f45642b = this.f45645e.mo29164d(new C15204bn(this), this.f45646f.mo79743a(C90051dc.f248916m), TimeUnit.MILLISECONDS);
            }
            this.f45652l = oqVar;
        }
    }
}
