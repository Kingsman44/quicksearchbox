package com.google.android.apps.search.googleapp.search.suggest.sources.icing;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.googleapp.search.suggest.C138020al;
import com.google.android.apps.search.googleapp.search.suggest.C138021am;
import com.google.android.apps.search.googleapp.search.suggest.C138022an;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.gms.appdatasearch.C142796al;
import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.b */
/* compiled from: PG */
public final /* synthetic */ class C138510b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138511c f376749a;

    /* renamed from: b */
    public final /* synthetic */ long f376750b;

    /* renamed from: c */
    public final /* synthetic */ C138133o f376751c;

    public /* synthetic */ C138510b(C138511c cVar, long j, C138133o oVar) {
        this.f376749a = cVar;
        this.f376750b = j;
        this.f376751c = oVar;
    }

    public final Object apply(Object obj) {
        String str;
        C58148f fVar;
        C138511c cVar = this.f376749a;
        long j = this.f376750b;
        C138133o oVar = this.f376751c;
        cVar.f376756e.f376788a.mo114098b((int) (cVar.f376754c.mo26871c() - j));
        C138534f fVar2 = cVar.f376758g;
        String str2 = oVar.f375825b;
        C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
        String str3 = oVar.f375825b;
        uVar.copyOnWrite();
        C138678v vVar = (C138678v) uVar.instance;
        str3.getClass();
        vVar.f377197a |= 1;
        vVar.f377198b = str3;
        C142797am amVar = new C142797am((SearchResults) obj);
        while (amVar.hasNext()) {
            C142796al a = amVar.next();
            String h = a.mo117712h("text1");
            ByteBuffer j2 = a.mo117714j();
            int i = 0;
            String str4 = null;
            if (j2 != null) {
                try {
                    fVar = (C58148f) C62942bv.parseFrom((C62942bv) C58148f.f155452f, j2, C62921ba.m95368a());
                } catch (C62974ct unused) {
                    fVar = null;
                }
                if (fVar != null) {
                    for (C58146d dVar : fVar.f155457d) {
                        if (!dVar.f155449e.isEmpty() && TextUtils.equals(dVar.f155446b, "image")) {
                            str = (String) dVar.f155449e.get(0);
                            break;
                        }
                    }
                    ((C58970a) ((C58970a) C138534f.f376789a.mo56226d()).mo56372aa(41253)).mo56386p("No icon image found.");
                }
            }
            str = null;
            String h2 = a.mo117712h("intent_data");
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(h2)) {
                if (str.contains("resource_name_obfuscated")) {
                    String host = Uri.parse(str).getHost();
                    if (host != null) {
                        try {
                            ApplicationInfo applicationInfo = fVar2.f376790b.getApplicationInfo(host, 128);
                            if (applicationInfo != null) {
                                i = applicationInfo.icon;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            ((C58970a) ((C58970a) ((C58970a) C138534f.f376789a.mo56226d()).mo56382g(e)).mo56372aa(41248)).mo56389s("Invalid package name: %s", host);
                        }
                        if (i > 0) {
                            str4 = "android.resource://" + host + "/" + i;
                        }
                    }
                    if (str4 != null) {
                        str = str4;
                    }
                }
                long round = Math.round(a.mo117705a() * 1500.0d);
                C138027as asVar = (C138027as) C138030av.f375536m.createBuilder();
                asVar.copyOnWrite();
                C138030av avVar = (C138030av) asVar.instance;
                h.getClass();
                avVar.f375538a |= 1;
                avVar.f375539b = h;
                C138029au auVar = C138029au.ON_DEVICE_APP;
                asVar.copyOnWrite();
                C138030av avVar2 = (C138030av) asVar.instance;
                avVar2.f375541d = auVar.f375534n;
                avVar2.f375538a |= 4;
                C138032ax axVar = C138032ax.APP_STRIP;
                asVar.copyOnWrite();
                C138030av avVar3 = (C138030av) asVar.instance;
                avVar3.f375547k = axVar.f375579B;
                avVar3.f375538a |= 128;
                C138034az azVar = C138034az.ICING;
                asVar.copyOnWrite();
                C138030av avVar4 = (C138030av) asVar.instance;
                avVar4.f375545i = azVar.f375590i;
                avVar4.f375538a |= 32;
                asVar.copyOnWrite();
                C138030av avVar5 = (C138030av) asVar.instance;
                avVar5.f375538a |= 64;
                avVar5.f375546j = (int) round;
                C138020al alVar = (C138020al) C138025aq.f375512e.createBuilder();
                C138021am amVar2 = (C138021am) C138022an.f375501e.createBuilder();
                amVar2.copyOnWrite();
                C138022an anVar = (C138022an) amVar2.instance;
                str.getClass();
                anVar.f375503a |= 1;
                anVar.f375504b = str;
                amVar2.copyOnWrite();
                C138022an anVar2 = (C138022an) amVar2.instance;
                h2.getClass();
                anVar2.f375503a |= 2;
                anVar2.f375505c = h2;
                alVar.copyOnWrite();
                C138025aq aqVar = (C138025aq) alVar.instance;
                C138022an anVar3 = (C138022an) amVar2.build();
                anVar3.getClass();
                aqVar.f375516c = anVar3;
                aqVar.f375514a |= 2;
                asVar.copyOnWrite();
                C138030av avVar6 = (C138030av) asVar.instance;
                C138025aq aqVar2 = (C138025aq) alVar.build();
                aqVar2.getClass();
                avVar6.f375548l = aqVar2;
                avVar6.f375538a |= 256;
                uVar.mo114310b(asVar);
            }
        }
        return (C138678v) uVar.build();
    }
}
