package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1587q.p1588a.C19120b;
import com.google.android.libraries.assistant.p1587q.p1588a.C19123e;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52443ry;
import com.google.assistant.p3897e.p3921j.C52444rz;
import com.google.assistant.p3897e.p3921j.C52450se;
import com.google.assistant.p3897e.p3921j.C52452sg;
import com.google.assistant.p3897e.p3921j.C52459sn;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ad */
/* compiled from: PG */
public final /* synthetic */ class C92869ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f259096a;

    public /* synthetic */ C92869ad(String str) {
        this.f259096a = str;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f259096a;
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C92872ag.f259102a;
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C92872ag.m152912b(str));
        }
        Bundle bundle = (Bundle) axVar.mo56107c();
        if (!bundle.containsKey("success")) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.ABORTED, "Sunshine does not return state."));
        }
        boolean z = bundle.getBoolean("success");
        C52450se seVar = (C52450se) C52452sg.f137691f.createBuilder();
        seVar.copyOnWrite();
        C52452sg sgVar = (C52452sg) seVar.instance;
        sgVar.f137693a |= 2;
        sgVar.f137696d = z;
        if (z && bundle.containsKey("slice_uri")) {
            String string = bundle.getString("slice_uri");
            seVar.copyOnWrite();
            C52452sg sgVar2 = (C52452sg) seVar.instance;
            string.getClass();
            sgVar2.f137693a |= 4;
            sgVar2.f137697e = string;
        }
        if (bundle.containsKey("tts_config")) {
            C63010eb parserForType = C19123e.f53587d.getParserForType();
            byte[] byteArray = bundle.getByteArray("tts_config");
            MessageLite messageLite = null;
            if (byteArray != null) {
                try {
                    messageLite = (MessageLite) parserForType.mo59008g(C63088z.m96139A(byteArray));
                } catch (C62974ct | IllegalArgumentException unused) {
                    C59104x c = C92872ag.f259102a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "WellbeingPerformer");
                    ((C59052c) ((C59052c) c).mo56372aa(13087)).mo56389s("Wrong proto marked as type %s", "tts_config");
                }
            }
            C19123e eVar2 = (C19123e) messageLite;
            if (!(eVar2 == null || (eVar2.f53589a & 1) == 0)) {
                String str2 = eVar2.f53590b;
                seVar.copyOnWrite();
                C52452sg sgVar3 = (C52452sg) seVar.instance;
                str2.getClass();
                sgVar3.f137693a |= 1;
                sgVar3.f137694b = str2;
                for (Map.Entry entry : Collections.unmodifiableMap(eVar2.f53591c).entrySet()) {
                    String str3 = (String) entry.getKey();
                    C19120b bVar = (C19120b) entry.getValue();
                    int i = bVar.f53584a;
                    if (i == 1) {
                        String str4 = (String) bVar.f53585b;
                        C52443ry ryVar = (C52443ry) C52444rz.f137661c.createBuilder();
                        String str5 = bVar.f53584a == 1 ? (String) bVar.f53585b : BuildConfig.FLAVOR;
                        ryVar.copyOnWrite();
                        C52444rz rzVar = (C52444rz) ryVar.instance;
                        str5.getClass();
                        rzVar.f137663a = 1;
                        rzVar.f137664b = str5;
                        seVar.mo53876a(str3, (C52444rz) ryVar.build());
                    } else if (i == 2) {
                        C58081m mVar = (C58081m) bVar.f53585b;
                        C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
                        int i2 = mVar.f155256a;
                        qkVar.copyOnWrite();
                        C52403ql qlVar = (C52403ql) qkVar.instance;
                        qlVar.f137514a |= 1;
                        qlVar.f137515b = i2;
                        int i3 = mVar.f155257b;
                        qkVar.copyOnWrite();
                        C52403ql qlVar2 = (C52403ql) qkVar.instance;
                        qlVar2.f137514a |= 2;
                        qlVar2.f137516c = i3;
                        int i4 = mVar.f155258c;
                        qkVar.copyOnWrite();
                        C52403ql qlVar3 = (C52403ql) qkVar.instance;
                        qlVar3.f137514a |= 4;
                        qlVar3.f137517d = i4;
                        int i5 = mVar.f155259d;
                        qkVar.copyOnWrite();
                        C52403ql qlVar4 = (C52403ql) qkVar.instance;
                        qlVar4.f137514a |= 8;
                        qlVar4.f137518e = i5;
                        C52403ql qlVar5 = (C52403ql) qkVar.build();
                        C52443ry ryVar2 = (C52443ry) C52444rz.f137661c.createBuilder();
                        ryVar2.copyOnWrite();
                        C52444rz rzVar2 = (C52444rz) ryVar2.instance;
                        qlVar5.getClass();
                        rzVar2.f137664b = qlVar5;
                        rzVar2.f137663a = 2;
                        seVar.mo53876a(str3, (C52444rz) ryVar2.build());
                    } else if (i == 3) {
                        C58072d dVar = (C58072d) bVar.f53585b;
                        C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
                        int i6 = dVar.f155222c;
                        qaVar.copyOnWrite();
                        C52393qb qbVar = (C52393qb) qaVar.instance;
                        qbVar.f137481a |= 4;
                        qbVar.f137484d = i6;
                        int i7 = dVar.f155221b;
                        qaVar.copyOnWrite();
                        C52393qb qbVar2 = (C52393qb) qaVar.instance;
                        qbVar2.f137481a |= 2;
                        qbVar2.f137483c = i7;
                        int i8 = dVar.f155220a;
                        qaVar.copyOnWrite();
                        C52393qb qbVar3 = (C52393qb) qaVar.instance;
                        qbVar3.f137481a |= 1;
                        qbVar3.f137482b = i8;
                        C52393qb qbVar4 = (C52393qb) qaVar.build();
                        C52443ry ryVar3 = (C52443ry) C52444rz.f137661c.createBuilder();
                        ryVar3.copyOnWrite();
                        C52444rz rzVar3 = (C52444rz) ryVar3.instance;
                        qbVar4.getClass();
                        rzVar3.f137664b = qbVar4;
                        rzVar3.f137663a = 3;
                        seVar.mo53876a(str3, (C52444rz) ryVar3.build());
                    } else if (i == 4) {
                        C62910ar arVar = (C62910ar) bVar.f53585b;
                        C52459sn snVar = (C52459sn) C52460so.f137714d.createBuilder();
                        long j = arVar.f169860a;
                        snVar.copyOnWrite();
                        C52460so soVar = (C52460so) snVar.instance;
                        soVar.f137716a |= 1;
                        soVar.f137717b = j;
                        int i9 = arVar.f169861b;
                        snVar.copyOnWrite();
                        C52460so soVar2 = (C52460so) snVar.instance;
                        soVar2.f137716a |= 2;
                        soVar2.f137718c = i9;
                        C52460so soVar3 = (C52460so) snVar.build();
                        C52443ry ryVar4 = (C52443ry) C52444rz.f137661c.createBuilder();
                        ryVar4.copyOnWrite();
                        C52444rz rzVar4 = (C52444rz) ryVar4.instance;
                        soVar3.getClass();
                        rzVar4.f137664b = soVar3;
                        rzVar4.f137663a = 4;
                        seVar.mo53876a(str3, (C52444rz) ryVar4.build());
                    }
                }
            }
        }
        return C60856cj.m92900i(C22402a.m41821a("handle_wellbeing_results", "assistant.api.client_op.HandleWellbeingResults", seVar.build()));
    }
}
