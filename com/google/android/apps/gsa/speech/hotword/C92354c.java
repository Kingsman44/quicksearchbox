package com.google.android.apps.gsa.speech.hotword;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.libraries.search.p2904c.p2976v.C38120a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c */
/* compiled from: PG */
public final class C92354c {

    /* renamed from: a */
    public static final C58495hd f257487a;

    /* renamed from: b */
    private static final C58974d f257488b = C58974d.m91136j();

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("zh-Hant-TW", "cmn-Hant-TW");
        gzVar.mo55429h("zh-TW", "cmn-Hant-TW");
        gzVar.mo55429h("zh-Hans-CN", "cmn-Hans-CN");
        gzVar.mo55429h("zh-CN", "cmn-Hans-CN");
        gzVar.mo55429h("zh-Hant-HK", "yue-Hant-HK");
        gzVar.mo55429h("zh-HK", "yue-Hant-HK");
        f257487a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static C92343a m151655a(Context context) {
        boolean J = C90772bp.m148283J(context);
        boolean a = C38120a.m67297a(context);
        ((C58970a) ((C58970a) f257488b.mo56224b()).mo56372aa(12450)).mo56358K("Util.isLowRamDevice: %b, canUsePreemptibleAudioSource: %b", J, a);
        if (J) {
            return C92343a.LOW_RAM_DEVICE;
        }
        if (!a) {
            return C92343a.CAPTURE_AUDIO_HOTWORD_NOT_PERMITTED;
        }
        return C92343a.AVAILABLE;
    }

    /* renamed from: b */
    public static C92381e m151656b(C92362c cVar) {
        C90584f fVar = C90584f.UNKNOWN;
        C92362c cVar2 = C92362c.LINK_ACCOUNT;
        switch (cVar.ordinal()) {
            case 2:
                return C92381e.NO_ACCOUNT_LOGGED_IN;
            case 3:
                return C92381e.ENROLLMENT_NOT_UPLOADED;
            case 4:
                return C92381e.ENROLLMENT_UTTERANCES_NOT_READY;
            case 5:
                return C92381e.CLOUD_ENROLLMENT_FAILED;
            case 6:
                return C92381e.SETTINGS_UPDATE_FAILED;
            case 7:
                return C92381e.RETRAIN_FAILED;
            case 9:
                return C92381e.ENROLLMENT_TIMED_OUT;
            case 10:
                return C92381e.CAN_ENROLL_CHECK_FAILED;
            default:
                throw new AssertionError("Invalid EnrollmentStatus: ".concat(String.valueOf(String.valueOf(cVar))));
        }
    }

    /* renamed from: c */
    public static String m151657c(String str, C90584f fVar) {
        String str2 = (String) f257487a.getOrDefault(str, str);
        if (!str2.equals(str)) {
            ((C58970a) ((C58970a) f257488b.mo56224b()).mo56372aa(12453)).mo56354G("Changing locale %s to %s for hotword model lookup in MDD.", str, str2);
        }
        C90584f fVar2 = C90584f.UNKNOWN;
        C92362c cVar = C92362c.LINK_ACCOUNT;
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            ((C58970a) ((C58970a) f257488b.mo56225c()).mo56372aa(12452)).mo56386p("FileGroup queried for hotword model type `unknown`. This is undefined behavior; please use a specific model type.");
            return String.format(Locale.US, "hotword_model_%s_%s", new Object[]{str2, "unk"});
        } else if (ordinal == 1) {
            return String.format(Locale.US, "hotword_model_%s_%s", new Object[]{str2, "okg"});
        } else if (ordinal == 2) {
            return String.format(Locale.US, "hotword_model_%s_%s", new Object[]{str2, "okhey"});
        } else {
            throw new AssertionError("This line is unreachable because the enum switch is exhaustive.");
        }
    }

    /* renamed from: d */
    public static boolean m151658d(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            ((C58970a) ((C58970a) f257488b.mo56226d()).mo56372aa(12454)).mo56386p("#isCharging - no battery status.");
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m151659e(int i, String str) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            ((C58970a) ((C58970a) f257488b.mo56225c()).mo56372aa(12451)).mo56384n();
            return String.format("dsp_model_%s_%s", new Object[]{"unsupported", str});
        } else if (i2 == 100) {
            return String.format("dsp_model_%s_%s", new Object[]{"ok-google", str});
        } else if (i2 == 101) {
            return String.format("dsp_model_%s_%s", new Object[]{"x-google", str});
        } else {
            throw new AssertionError("This line is unreachable because the enum switch is exhaustive.");
        }
    }
}
