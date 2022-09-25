package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.p7195y.C91188at;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.p3926e.C52013hl;
import com.google.assistant.p3897e.p3921j.p3926e.C52015hn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bs */
/* compiled from: PG */
public final class C114822bs {

    /* renamed from: a */
    public static final C59071e f318591a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bs");

    /* renamed from: b */
    public final Context f318592b;

    /* renamed from: c */
    public final Activity f318593c;

    /* renamed from: d */
    private final C91183ao f318594d;

    public C114822bs(Context context, Activity activity, C91183ao aoVar) {
        this.f318592b = context;
        this.f318593c = activity;
        this.f318594d = aoVar;
    }

    /* renamed from: a */
    public final void mo101628a(C52013hl hlVar, ImageView imageView) {
        if ((hlVar.f136510a & 4) != 0) {
            C52015hn hnVar = hlVar.f136512c;
            if (hnVar == null) {
                hnVar = C52015hn.f136515e;
            }
            C51012dc dcVar = hnVar.f136520d;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if (!dcVar.f132817c.isEmpty()) {
                C91188at a = this.f318594d.mo85410a(this.f318592b);
                C52015hn hnVar2 = hlVar.f136512c;
                if (hnVar2 == null) {
                    hnVar2 = C52015hn.f136515e;
                }
                C51012dc dcVar2 = hnVar2.f136520d;
                if (dcVar2 == null) {
                    dcVar2 = C51012dc.f132813k;
                }
                a.mo85427p(a.mo85414b(C91188at.m148979q(Uri.parse(dcVar2.f132817c)), imageView), imageView);
                return;
            }
        }
        ((C59052c) ((C59052c) f318591a.mo56226d()).mo56372aa(29573)).mo56386p("#setWeatherIcon(): missing weather icon or url.");
    }

    /* renamed from: b */
    public final void mo101629b(C52013hl hlVar, TextView textView) {
        C52015hn hnVar = hlVar.f136512c;
        if (hnVar == null) {
            hnVar = C52015hn.f136515e;
        }
        if ((hnVar.f136517a & 2) == 0) {
            ((C59052c) ((C59052c) f318591a.mo56226d()).mo56372aa(29574)).mo56386p("setTemperatureMessage: missing temperature or unit.");
        }
        Object[] objArr = new Object[2];
        C52015hn hnVar2 = hlVar.f136512c;
        if (hnVar2 == null) {
            hnVar2 = C52015hn.f136515e;
        }
        objArr[0] = hnVar2.f136519c;
        objArr[1] = "°";
        textView.setText(String.format("%s%s", objArr));
    }
}
