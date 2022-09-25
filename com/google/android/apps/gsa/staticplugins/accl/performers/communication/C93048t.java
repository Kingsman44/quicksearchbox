package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.UserHandle;
import android.provider.Telephony;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.t */
/* compiled from: PG */
public final /* synthetic */ class C93048t implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259558a;

    /* renamed from: b */
    public final /* synthetic */ String f259559b;

    /* renamed from: c */
    public final /* synthetic */ String f259560c;

    public /* synthetic */ C93048t(ChatPerformer chatPerformer, String str, String str2) {
        this.f259558a = chatPerformer;
        this.f259559b = str;
        this.f259560c = str2;
    }

    public final void run() {
        C58485gu guVar;
        String str;
        ChatPerformer chatPerformer = this.f259558a;
        String str2 = this.f259559b;
        String str3 = this.f259560c;
        C93021be beVar = chatPerformer.f259396h;
        C89859i iVar = (C89859i) beVar.f259479c.mo27525b();
        iVar.mo83702b(C89849ae.OPA_SHORTCUT_CONTACT_MATCH_START);
        if (str3.isEmpty()) {
            str3 = Telephony.Sms.getDefaultSmsPackage(beVar.f259478b);
        }
        if (beVar.f259480d.hasShortcutHostPermission()) {
            if (!beVar.f259480d.hasShortcutHostPermission()) {
                ((C59052c) ((C59052c) C93021be.f259477a.mo56226d()).mo56372aa(13210)).mo56386p("No Shortcut Host Permission.");
                guVar = C58485gu.m89845m();
            } else {
                List<UserHandle> profiles = beVar.f259480d.getProfiles();
                if (profiles.isEmpty()) {
                    guVar = C58485gu.m89845m();
                } else {
                    try {
                        List<ShortcutInfo> shortcuts = beVar.f259480d.getShortcuts(new LauncherApps.ShortcutQuery().setPackage(str3).setQueryFlags(11), profiles.get(0));
                        if (shortcuts == null) {
                            guVar = C58485gu.m89845m();
                        } else {
                            guVar = C58485gu.m89842j(shortcuts);
                        }
                    } catch (IllegalStateException unused) {
                        ((C59052c) ((C59052c) C93021be.f259477a.mo56226d()).mo56372aa(13209)).mo56386p("Failed to query Shortcut API.");
                        guVar = C58485gu.m89845m();
                    }
                }
            }
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) guVar.get(i);
                if (!TextUtils.isEmpty(shortcutInfo.getLongLabel())) {
                    str = shortcutInfo.getLongLabel().toString();
                } else {
                    str = !TextUtils.isEmpty(shortcutInfo.getShortLabel()) ? shortcutInfo.getShortLabel().toString() : BuildConfig.FLAVOR;
                }
                if (C58890d.m90990e(str2, str)) {
                    iVar.mo83702b(C89849ae.OPA_SHORTCUT_CONTACT_MATCHED);
                }
            }
            iVar.mo83702b(C89849ae.OPA_SHORTCUT_CONTACT_MATCH_COMPLETE);
            return;
        }
        iVar.mo83702b(C89849ae.OPA_SHORTCUT_CONTACT_MATCH_FAILED);
    }
}
