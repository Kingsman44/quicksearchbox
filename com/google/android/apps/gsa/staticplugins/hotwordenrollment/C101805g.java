package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.h.s.e;
import com.google.android.apps.gsa.h.s.m;
import com.google.android.apps.gsa.h.s.q;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83935v;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74545ah;
import com.google.android.apps.gsa.p5855h.p5861s.C74546ai;
import com.google.android.apps.gsa.p5855h.p5861s.C74547aj;
import com.google.android.apps.gsa.p5855h.p5861s.C74548ak;
import com.google.android.apps.gsa.p5855h.p5861s.C74549c;
import com.google.android.apps.gsa.p5855h.p5861s.C74552o;
import com.google.android.apps.gsa.p5855h.p5861s.C74553r;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.p5855h.p5861s.C74556w;
import com.google.android.apps.gsa.p5855h.p5861s.C74557x;
import com.google.android.apps.gsa.p5855h.p5861s.C74558y;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.assistant.p3861at.C49879cj;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g */
/* compiled from: PG */
public final class C101805g {
    /* renamed from: a */
    public static C74555u m168451a(Activity activity) {
        ArrayList arrayList;
        Intent intent = activity.getIntent();
        C74554t i = C74555u.m120572i();
        i.mo70868b(s.b(intent.getIntExtra("com.google.apps.gsa.speech.voicematch.EXTRA_DOMAIN", s.a.a())));
        int i2 = 2;
        if (intent.hasExtra("unicorn-impersonation-config")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            C92391o oVar = (C92391o) ProtoParsers.m95522e(extras, "unicorn-impersonation-config", C92391o.f257641i, C62921ba.m95368a());
            if (!(oVar == null || (oVar.f257643a & 2) == 0 || oVar.f257645c.isEmpty())) {
                ((C74549c) i).f208697c = oVar;
            }
        }
        ((C74549c) i).f208696b = intent.getStringExtra("account_name");
        i.mo70869c(C9439b.m23955a(intent.getIntExtra("enrollment_entry_id", 0)));
        C74546ai d = C74547aj.m120536d();
        int intExtra = intent.getIntExtra("structure-flow-type", C74548ak.m120540a(1));
        if (intExtra != 1) {
            i2 = intExtra != 2 ? 1 : 3;
        }
        d.mo70863b(i2);
        C74552o oVar2 = (C74552o) d;
        oVar2.f208708a = C58837ba.m90858g(intent.getStringExtra("structure-domain-param-device-id"));
        oVar2.f208709b = C58837ba.m90858g(intent.getStringExtra("enrollment_structure_level_assistant_structure_id"));
        i.mo70873g(d.mo70862a());
        C74557x c = C74558y.m120591c();
        c.mo70875b(z.b(intent.getIntExtra("com.google.apps.gsa.speech.voicematch.home.EXTRA_FLOW_TYPE", z.a.a())));
        e d2 = C74556w.m120584d();
        d2.b(intent.getBooleanExtra("is-from-firebase-dynamic-link", false));
        if (intent.hasExtra("voice_match_enabled_device_ids")) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("voice_match_enabled_device_ids");
            stringArrayListExtra.getClass();
            d2.a = C58485gu.m89842j(C58485gu.m89842j(stringArrayListExtra));
        }
        if (intent.hasExtra("voice_match_supported_devices")) {
            C49879cj cjVar = C49879cj.f129628l;
            C62921ba a = C62921ba.m95368a();
            try {
                Parcelable parcelableExtra = intent.getParcelableExtra("voice_match_supported_devices");
                if (parcelableExtra instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelableExtra;
                    bundle.setClassLoader(ProtoParsers.InternalDontUse.class.getClassLoader());
                    arrayList = bundle.getParcelableArrayList("protoparsers");
                } else {
                    arrayList = (ArrayList) parcelableExtra;
                }
                d2.b = C58485gu.m89842j(C58485gu.m89842j(ProtoParsers.m95527j(arrayList, cjVar, a)));
            } catch (C62974ct e) {
                throw new RuntimeException(e);
            }
        }
        c.mo70876c(d2.a());
        i.mo70870d(c.mo70874a());
        C74543ad d3 = C74544ae.m120523d();
        d3.mo70851c(af.b(intent.getIntExtra("com.google.apps.gsa.speech.voicematch.phone.EXTRA_FLOW_TYPE", af.a.a())));
        q f = C74553r.m120558f();
        f.e(intent.getBooleanExtra("enrollment_is_wear_os_assistant", false));
        f.f(intent.getBooleanExtra("is_wear_os_force_retrain", false));
        f.d(intent.getBooleanExtra("show_battery_usage_disclaimer", false));
        f.c(intent.getBooleanExtra("is_rohan_enrollment", false));
        f.b(intent.getBooleanExtra("is_oobe", false));
        d3.mo70850b(f.a());
        C83935v vVar = null;
        if (intent.hasExtra("extra_hotword_enrollment_unicorn_info")) {
            try {
                vVar = (C83935v) ProtoParsers.m95519b(intent, "extra_hotword_enrollment_unicorn_info", C83935v.f228590f, C62921ba.m95368a());
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) C74545ah.f208694a.mo56225c()).mo56382g(e2)).mo56372aa(2174)).mo56386p("Failed to parse UnicornInfo");
            }
        }
        m d4 = C74545ah.m120530d();
        d4.a = vVar;
        d4.c(intent.getBooleanExtra("use-neutral-buttons", false));
        d4.b(intent.getIntExtra("sequence-theme-id", 0));
        d3.mo70852d(d4.a());
        i.mo70872f(d3.mo70849a());
        aa c2 = C74542ab.m120516c();
        c2.c(ac.b(intent.getIntExtra("com.google.apps.gsa.speech.voicematch.layoutthemeparams.type", ac.a.a())));
        c2.b(intent.getBooleanExtra("com.google.apps.gsa.speech.voicematch.layoutthemeparams.disabledynamiccolor", false));
        i.mo70871e(c2.a());
        return i.mo70867a();
    }
}
