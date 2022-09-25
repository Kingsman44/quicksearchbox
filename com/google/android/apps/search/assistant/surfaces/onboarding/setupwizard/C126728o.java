package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.o */
/* compiled from: PG */
public final class C126728o {

    /* renamed from: a */
    private static final C59071e f349013a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.o");

    /* renamed from: b */
    private static final C58485gu f349014b = C58485gu.m89849q("intent_extra_tng_suw_enabled_from_agsa_c", "intent_extra_use_unicorn_flow", "hotword", "hardwareButtonTraining");

    /* renamed from: a */
    public static Intent m207276a(Intent intent) {
        Intent intent2;
        Intent intent3;
        boolean booleanExtra = intent.getBooleanExtra("hardwareButtonTraining", false);
        boolean booleanExtra2 = intent.getBooleanExtra("hotword", true);
        int intExtra = intent.getIntExtra("intent_extra_screen_type", -1);
        C126685a aVar = new C126685a();
        boolean booleanExtra3 = intent.getBooleanExtra("intent_extra_biometrics_disabled", false);
        if (intExtra == -1) {
            if (booleanExtra3) {
                aVar.mo107683b(1);
                intent3 = aVar.mo107682a().mo107733b();
            } else {
                aVar.mo107683b(0);
                intent3 = aVar.mo107682a().mo107733b();
            }
            m207277b(intent, intent3);
            return intent3;
        }
        if (intExtra != 0) {
            intent2 = null;
            if (intExtra != 1) {
                if (intExtra == 2) {
                    aVar.mo107683b(1);
                    intent2 = aVar.mo107682a().mo107733b();
                } else if (intExtra != 3) {
                    ((C59052c) ((C59052c) f349013a.mo56226d()).mo56372aa(37110)).mo56386p("unknown current screen type");
                }
            } else if (booleanExtra) {
                aVar.mo107683b(3);
                intent2 = aVar.mo107682a().mo107733b();
            }
        } else if (booleanExtra2) {
            aVar.mo107683b(2);
            intent2 = aVar.mo107682a().mo107733b();
        } else {
            aVar.mo107683b(1);
            intent2 = aVar.mo107682a().mo107733b();
        }
        if (intent2 != null) {
            m207277b(intent, intent2);
        }
        return intent2;
    }

    /* renamed from: b */
    public static void m207277b(Intent intent, Intent intent2) {
        C58485gu guVar = f349014b;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) guVar.get(i2);
            intent2.putExtra(str, intent.getBooleanExtra(str, false));
        }
        if (intent.hasExtra("intent_extra_given_name")) {
            intent2.putExtra("intent_extra_given_name", intent.getStringExtra("intent_extra_given_name"));
        }
        if (intent.hasExtra("intent_extra_standard_gender")) {
            intent2.putExtra("intent_extra_standard_gender", intent.getIntExtra("intent_extra_standard_gender", -1));
        }
        C45250g.m80605a(intent, intent2);
    }

    /* renamed from: c */
    public static void m207278c(Fragment fragment) {
        C0167am activity = fragment.getActivity();
        if (activity != null) {
            Intent a = m207276a(activity.getIntent());
            if (a == null) {
                activity.setResult(-1);
                activity.finish();
                return;
            }
            fragment.startActivityForResult(a, 10000);
        }
    }

    /* renamed from: d */
    public static void m207279d(Fragment fragment) {
        C0167am activity = fragment.getActivity();
        if (activity != null) {
            Intent a = m207276a(activity.getIntent());
            if (a == null) {
                activity.setResult(-1);
            } else {
                a.setFlags(33554432);
                C47709i.m84861a(fragment, a);
            }
            activity.finish();
        }
    }

    /* renamed from: e */
    public static boolean m207280e(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
