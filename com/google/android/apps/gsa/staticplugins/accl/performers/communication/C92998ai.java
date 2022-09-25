package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.conversation.clientop.C22535l;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ai */
/* compiled from: PG */
final class C92998ai {

    /* renamed from: a */
    private static final C59071e f259429a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.communication.ai");

    /* renamed from: a */
    static ResultReceiver m153056a(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    /* renamed from: b */
    static String m153057b(C52321nk nkVar) {
        C51058ev evVar;
        C51058ev evVar2;
        C51058ev evVar3;
        C51098gh ghVar = nkVar.f137333f;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        C52374pj pjVar = nkVar.f137331d;
        if (pjVar == null) {
            pjVar = C52374pj.f137434e;
        }
        String replace = (pjVar.f137437b == 2 ? (String) pjVar.f137438c : BuildConfig.FLAVOR).replace("+", BuildConfig.FLAVOR);
        C52374pj pjVar2 = nkVar.f137331d;
        if (pjVar2 == null) {
            pjVar2 = C52374pj.f137434e;
        }
        if (!(pjVar2.f137437b == 6 ? (String) pjVar2.f137438c : BuildConfig.FLAVOR).isEmpty()) {
            C52374pj pjVar3 = nkVar.f137331d;
            C52374pj pjVar4 = pjVar3 == null ? C52374pj.f137434e : pjVar3;
            if (pjVar4.f137437b == 6) {
                String str = (String) pjVar4.f137438c;
            }
            if (pjVar3 == null) {
                pjVar3 = C52374pj.f137434e;
            }
            if (pjVar3.f137437b == 6) {
                return (String) pjVar3.f137438c;
            }
            return BuildConfig.FLAVOR;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (!evVar.f132952j.isEmpty()) {
            int i = ghVar.f133012b;
            if (i == 1) {
                evVar3 = (C51058ev) ghVar.f133013c;
            } else {
                evVar3 = C51058ev.f132941o;
            }
            String str2 = evVar3.f132952j;
            return (i == 1 ? (C51058ev) ghVar.f133013c : C51058ev.f132941o).f132952j;
        }
        if (ghVar.f133012b == 1) {
            evVar2 = (C51058ev) ghVar.f133013c;
        } else {
            evVar2 = C51058ev.f132941o;
        }
        if (!C58890d.m90990e("com.whatsapp", evVar2.f132944b) || TextUtils.isEmpty(replace)) {
            return replace;
        }
        return String.format("%s@s.whatsapp.net", new Object[]{replace});
    }

    /* renamed from: c */
    static boolean m153058c(long j, PackageManager packageManager) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.apps.messaging", 0);
            if (packageInfo == null || packageInfo.getLongVersionCode() < j) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f259429a.mo56225c()).mo56382g(e)).mo56372aa(13190)).mo56386p("Failed to get Android Messages version.");
        }
    }

    /* renamed from: d */
    static boolean m153059d(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
    }

    /* renamed from: e */
    static boolean m153060e(Intent intent, String str, PackageManager packageManager) {
        C51058ev evVar;
        for (C51098gh ghVar : C22535l.m41989a(C22535l.m41990b(intent, packageManager), packageManager)) {
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            if (C58890d.m90990e(str, evVar.f132944b)) {
                return true;
            }
        }
        return false;
    }
}
