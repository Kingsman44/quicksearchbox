package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14372gu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14376gy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14377gz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14385hg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14528mo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.g */
/* compiled from: PG */
final class C15087g extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public final ImageView f45265a;

    /* renamed from: b */
    public final TextView f45266b;

    /* renamed from: c */
    public final TextView f45267c;

    /* renamed from: d */
    public final ImageView f45268d;

    /* renamed from: e */
    public C14528mo f45269e = null;

    /* renamed from: f */
    final /* synthetic */ C15089i f45270f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15087g(C15089i iVar, View view) {
        super(view);
        this.f45270f = iVar;
        this.f45265a = (ImageView) view.findViewById(R.id.recent_call_contact_image);
        this.f45266b = (TextView) view.findViewById(R.id.recent_call_contact_name);
        this.f45267c = (TextView) view.findViewById(R.id.recent_call_time);
        this.f45268d = (ImageView) view.findViewById(R.id.recent_call_type_indicator);
    }

    public final void onClick(View view) {
        C15089i iVar = this.f45270f;
        if (iVar.mo21948d()) {
            C59104x d = C15089i.f45272a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.CallCenterRend");
            ((C59052c) ((C59052c) d).mo56372aa(45941)).mo56386p("Not placing new call to recent number due to active call.");
        } else if (this.f45269e == null) {
        } else {
            if (!iVar.f45277e.mo79746e(C90051dc.f248864bS) || !this.f45270f.f45277e.mo79746e(C90051dc.f248842ax)) {
                C15089i iVar2 = this.f45270f;
                C14986h hVar = iVar2.f45275c;
                C14528mo moVar = this.f45269e;
                moVar.getClass();
                Duration ofNanos = Duration.ofNanos(iVar2.f45278f.mo26872d());
                C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
                C14372gu guVar = (C14372gu) C14385hg.f43516f.createBuilder();
                C14376gy gyVar = (C14376gy) C14377gz.f43502b.createBuilder();
                gyVar.copyOnWrite();
                ((C14377gz) gyVar.instance).f43504a = moVar;
                guVar.copyOnWrite();
                C14385hg hgVar = (C14385hg) guVar.instance;
                C14377gz gzVar = (C14377gz) gyVar.build();
                gzVar.getClass();
                hgVar.f43520c = gzVar;
                hgVar.f43519b = 1;
                long nanos = ofNanos.toNanos();
                guVar.copyOnWrite();
                C14385hg hgVar2 = (C14385hg) guVar.instance;
                hgVar2.f43518a = 1 | hgVar2.f43518a;
                hgVar2.f43522e = nanos;
                gtVar.copyOnWrite();
                C14492lf lfVar = (C14492lf) gtVar.instance;
                C14385hg hgVar3 = (C14385hg) guVar.build();
                hgVar3.getClass();
                lfVar.f43801d = hgVar3;
                lfVar.f43800c = 15;
                hVar.mo21875g((C14492lf) gtVar.build());
                return;
            }
            C15089i iVar3 = this.f45270f;
            C14986h hVar2 = iVar3.f45275c;
            C14528mo moVar2 = this.f45269e;
            moVar2.getClass();
            String str = moVar2.f43911a;
            Duration ofNanos2 = Duration.ofNanos(iVar3.f45278f.mo26872d());
            C14371gt gtVar2 = (C14371gt) C14492lf.f43796e.createBuilder();
            C14362gk gkVar = (C14362gk) C14365gn.f43466q.createBuilder();
            long nanos2 = ofNanos2.toNanos();
            gkVar.copyOnWrite();
            ((C14365gn) gkVar.instance).f43469b = nanos2;
            gkVar.copyOnWrite();
            ((C14365gn) gkVar.instance).f43468a = 32;
            gkVar.copyOnWrite();
            str.getClass();
            ((C14365gn) gkVar.instance).f43482o = str;
            gkVar.copyOnWrite();
            ((C14365gn) gkVar.instance).f43483p = true;
            gtVar2.copyOnWrite();
            C14492lf lfVar2 = (C14492lf) gtVar2.instance;
            C14365gn gnVar = (C14365gn) gkVar.build();
            gnVar.getClass();
            lfVar2.f43801d = gnVar;
            lfVar2.f43800c = 3;
            hVar2.mo21875g((C14492lf) gtVar2.build());
        }
    }
}
