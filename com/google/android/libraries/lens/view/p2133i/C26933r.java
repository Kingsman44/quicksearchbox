package com.google.android.libraries.lens.view.p2133i;

import android.os.Build;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p2000c.C24105b;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.main.C27314bd;
import com.google.android.libraries.lens.view.main.C27327bq;
import com.google.android.libraries.lens.view.main.C27390dy;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26898c;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26899d;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26900e;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26913i;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26916l;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.lens.p4707j.C62575i;
import com.google.lens.p4707j.C62576j;
import com.google.lens.p4707j.C62584r;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54031cl;
import com.google.p4017at.p4056g.p4057a.p4058a.C54032cm;
import com.google.p4017at.p4056g.p4057a.p4058a.C54071w;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.i.r */
/* compiled from: PG */
public final /* synthetic */ class C26933r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26916l f73404a;

    /* renamed from: b */
    public final /* synthetic */ C26925j f73405b;

    public /* synthetic */ C26933r(C26925j jVar, C26916l lVar) {
        this.f73405b = jVar;
        this.f73404a = lVar;
    }

    public final void onClick(View view) {
        C26925j jVar = this.f73405b;
        C26916l lVar = this.f73404a;
        int i = C26934s.f73406i;
        C26932q qVar = jVar.f73365a;
        if (qVar.f73397l != null) {
            C26897b bVar = C26897b.READY_TO_SEND;
            int ordinal = lVar.mo32288a().ordinal();
            if (ordinal == 0) {
                qVar.mo32317b(view);
                String str = lVar.mo32290c().f168968a;
                C26913i iVar = qVar.f73391f;
                if (iVar != null) {
                    iVar.mo32274e(str, C26897b.SENDING);
                }
                C27390dy dyVar = qVar.f73402q;
                if (dyVar != null) {
                    C62584r c = lVar.mo32290c();
                    C27327bq bqVar = dyVar.f75012b.f74881C;
                    C62576j jVar2 = dyVar.f75011a;
                    String str2 = c.f168968a;
                    C56306df dfVar = C56306df.UNKNOWN_FILTER_TYPE;
                    C26898c cVar = C26898c.INTERNAL;
                    C24231w wVar = C24231w.UNKNOWN;
                    int b = C62575i.m94799b(jVar2.f168941c);
                    int i2 = 1;
                    if (b == 0) {
                        b = 1;
                    }
                    if (b - 2 == 0) {
                        bqVar.f74809n.mo19974a(C37194a.f98459aV.mo40816j("cloud_copy_target_device_guid", str2));
                    }
                    C26900e a = bqVar.f74782ab.mo32279a(jVar2);
                    if (!a.mo32265a().isPresent()) {
                        C26899d dVar = bqVar.f74781aa;
                        int b2 = C62575i.m94799b(jVar2.f168941c);
                        if (b2 != 0) {
                            i2 = b2;
                        }
                        dVar.mo32278i(str2, i2);
                        ((C59052c) ((C59052c) C27327bq.f74753a.mo56225c()).mo56372aa(49746)).mo56386p("Failed to compose cloud copy payload.");
                        C37215b bVar2 = bqVar.f74809n;
                        C37252a i3 = C37194a.f98460aW.mo40815i(C62722b.UNKNOWN);
                        ((C37253b) i3).mo40795s("cloud_copy_target_device_guid", str2);
                        bVar2.mo19974a(i3);
                        return;
                    }
                    if (a.mo32266b() == 3) {
                        C54071w wVar2 = (C54071w) a.mo32265a().orElse(C54071w.f141876c);
                        bqVar.f74781aa.mo32276g(bqVar.f74800e.getString(R.string.lens_cloud_copy_text_size_limit_exceeded_toast_message, new Object[]{Integer.valueOf((wVar2.f141878a == 1 ? (String) wVar2.f141879b : BuildConfig.FLAVOR).length()), c.f168969b}));
                    }
                    C54031cl clVar = (C54031cl) C54032cm.f141762d.createBuilder();
                    clVar.copyOnWrite();
                    c.getClass();
                    ((C54032cm) clVar.instance).f141764a = c;
                    String str3 = Build.MODEL;
                    clVar.copyOnWrite();
                    str3.getClass();
                    ((C54032cm) clVar.instance).f141766c = str3;
                    C54071w wVar3 = (C54071w) a.mo32265a().get();
                    clVar.copyOnWrite();
                    wVar3.getClass();
                    ((C54032cm) clVar.instance).f141765b = wVar3;
                    C54032cm cmVar = (C54032cm) clVar.build();
                    C60856cj.m92911t(((C24105b) bqVar.f74780Z.mo17428b()).mo29499b(cmVar), C47810es.m84974n(new C27314bd(bqVar, c, cmVar)), bqVar.f74799d);
                }
            } else if (ordinal == 2) {
                qVar.mo32317b(view);
            }
        }
    }
}
