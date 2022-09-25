package com.google.android.apps.gsa.nga.engine.grammar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6144ui.C78018a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.s */
/* compiled from: PG */
public final class C76141s implements C76143u {

    /* renamed from: a */
    private static final C59071e f211112a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.grammar.s");

    /* renamed from: b */
    private final C78018a f211113b;

    /* renamed from: c */
    private final Context f211114c;

    /* renamed from: d */
    private final String f211115d;

    /* renamed from: e */
    private final String f211116e;

    /* renamed from: f */
    private final C74965n f211117f;

    public C76141s(C78018a aVar, Context context, C74965n nVar) {
        this.f211113b = aVar;
        this.f211117f = nVar;
        this.f211114c = context;
        this.f211115d = (String) nVar.mo71340o().orElse(BuildConfig.FLAVOR);
        String str = (String) nVar.mo71340o().orElse(BuildConfig.FLAVOR);
        if (str.startsWith("com.chrome.") || str.startsWith("org.chromium.chrome")) {
            str = "chrome";
        } else if (str.startsWith("com.google.android") || str.startsWith("com.android")) {
            str = str.substring(str.lastIndexOf(46) + 1);
        }
        this.f211116e = str;
    }

    /* renamed from: b */
    private static String m122715b(boolean z) {
        return true != z ? BuildConfig.FLAVOR : "true";
    }

    /* renamed from: a */
    public final C58495hd mo72083a() {
        String str;
        C58490gz gzVar = new C58490gz(4);
        for (C76140r rVar : C76140r.values()) {
            if (rVar != C76140r.UNKNOWN) {
                String str2 = rVar.f211111i;
                switch (((C76140r) DesugarArrays.stream((T[]) C76140r.values()).filter(new C76139q(str2)).findFirst().orElse(C76140r.UNKNOWN)).ordinal()) {
                    case 0:
                        str = m122715b(this.f211117f.mo71340o().equals(Optional.m71637of("com.google.android.gm")));
                        break;
                    case 1:
                        boolean z = true;
                        if (!"com.google.android.apps.nexuslauncher".equals(this.f211115d)) {
                            Context context = this.f211114c;
                            Intent intent = new Intent("android.intent.action.MAIN");
                            intent.addCategory("android.intent.category.HOME");
                            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                            if (!((resolveActivity == null || resolveActivity.activityInfo == null) ? BuildConfig.FLAVOR : resolveActivity.activityInfo.packageName).equals(this.f211115d)) {
                                z = false;
                            }
                        }
                        str = m122715b(z);
                        break;
                    case 2:
                        str = this.f211115d;
                        break;
                    case 3:
                        str = this.f211116e;
                        break;
                    case 4:
                        str = m122715b(this.f211117f.mo71328c().mo71264c());
                        break;
                    case 5:
                        str = m122715b(this.f211117f.mo71328c().mo71265d());
                        break;
                    case 6:
                        str = m122715b(this.f211113b.mo72969h());
                        break;
                    default:
                        ((C59052c) ((C59052c) f211112a.mo56225c()).mo56372aa(3906)).mo56389s("Cannot handle required variable %s", str2);
                        str = null;
                        break;
                }
                if (str != null) {
                    gzVar.mo55429h(rVar.f211111i, str);
                }
            }
        }
        return gzVar.mo55427f(false);
    }
}
