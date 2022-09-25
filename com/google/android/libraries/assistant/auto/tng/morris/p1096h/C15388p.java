package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telecom.GatewayInfo;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.car.CarCall;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14203an;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14210au;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.p */
/* compiled from: PG */
public final class C15388p {

    /* renamed from: a */
    private static final C59071e f46169a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.h.p");

    /* renamed from: b */
    private final Context f46170b;

    public C15388p(Context context) {
        this.f46170b = context;
    }

    /* renamed from: a */
    public static int m32014a(C14594p pVar) {
        C14594p pVar2 = C14594p.UNKNOWN;
        int ordinal = pVar.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        int i = 2;
        if (ordinal == 2) {
            return 8;
        }
        if (ordinal != 3) {
            i = 4;
            if (ordinal != 4) {
                C59104x c = f46169a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.PhoneUtils");
                ((C59052c) ((C59052c) c).mo56372aa(46118)).mo56386p("Unknown audio route, returning INVALID_AUDIO_ROUTE");
                return -1;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static String m32016d() {
        if (Locale.getDefault() == null) {
            return Locale.US.getCountry();
        }
        return Locale.getDefault().getCountry();
    }

    /* renamed from: e */
    public static String m32017e(Context context, C14749d dVar, String str) {
        C14210au auVar;
        C14203an anVar;
        if (C58837ba.m90859h(str)) {
            return context.getResources().getString(R.string.unknown_caller);
        }
        Optional a = dVar.mo21714a(C14984b.m31505c(str));
        if (a.isEmpty()) {
            return str;
        }
        C14221be beVar = (C14221be) a.get();
        if (beVar.f43043a == 15) {
            auVar = (C14210au) beVar.f43044b;
        } else {
            auVar = C14210au.f42993c;
        }
        if (auVar.f42995a == 1) {
            anVar = (C14203an) auVar.f42996b;
        } else {
            anVar = C14203an.f42982b;
        }
        String str2 = anVar.f42984a;
        return C58837ba.m90859h(str2) ? str : str2;
    }

    /* renamed from: f */
    public static String m32018f(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (!(carCall == null || carCall.f387936f == null)) {
            if (Build.VERSION.SDK_INT > 29) {
                GatewayInfo gatewayInfo = carCall.f387936f.f387952m;
                if (gatewayInfo != null) {
                    return gatewayInfo.getOriginalAddress().getSchemeSpecificPart();
                }
            } else {
                Uri uri = carCall.f387936f.f387944e;
                if (uri != null) {
                    return uri.getSchemeSpecificPart();
                }
            }
            Uri uri2 = carCall.f387936f.f387940a;
            if (uri2 != null) {
                return uri2.getSchemeSpecificPart();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final Optional mo22277c() {
        TelephonyManager telephonyManager = (TelephonyManager) C39239a.m68666a(this.f46170b, C39226b.TAG_ASSISTANT_AUTO_TNG_MORRIS).getSystemService(TelephonyManager.class);
        if (telephonyManager == null) {
            C59104x c = f46169a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.PhoneUtils");
            ((C59052c) ((C59052c) c).mo56372aa(46120)).mo56386p("Unable to fetch voicemail number: null TelephonyManager.");
            return Optional.empty();
        }
        try {
            return Optional.ofNullable(telephonyManager.getVoiceMailNumber());
        } catch (SecurityException e) {
            C59104x c2 = f46169a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.PhoneUtils");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(46119)).mo56386p("Security exception when attempting to fetch voicemail number.");
            return Optional.empty();
        }
    }

    /* renamed from: g */
    public final boolean mo22278g(String str) {
        TelecomManager telecomManager = (TelecomManager) C39239a.m68666a(this.f46170b, C39226b.TAG_ASSISTANT_AUTO_TNG_MORRIS).getSystemService(TelecomManager.class);
        if (telecomManager != null) {
            Uri parse = Uri.parse("tel:".concat(String.valueOf(str)));
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.telecom.extra.START_CALL_WITH_SPEAKERPHONE", true);
            telecomManager.placeCall(parse, bundle);
            return true;
        }
        C59104x c = f46169a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.PhoneUtils");
        ((C59052c) ((C59052c) c).mo56372aa(46122)).mo56386p("Unable to place call, TelecomManager unavailable.");
        return false;
    }

    /* renamed from: b */
    public static C14594p m32015b(int i) {
        if (i == 1) {
            return C14594p.EARPIECE;
        }
        if (i == 2) {
            return C14594p.BLUETOOTH;
        }
        if (i == 4 || i == 5) {
            return C14594p.WIRED_HEADSET;
        }
        if (i != 8) {
            return C14594p.UNKNOWN;
        }
        return C14594p.SPEAKER;
    }
}
