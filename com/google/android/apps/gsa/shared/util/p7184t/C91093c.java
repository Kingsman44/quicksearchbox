package com.google.android.apps.gsa.shared.util.p7184t;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.t.c */
/* compiled from: PG */
public class C91093c implements C91097g {

    /* renamed from: a */
    private static final C59071e f254385a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.t.c");

    /* renamed from: b */
    private final Context f254386b;

    /* renamed from: c */
    private final boolean f254387c;

    /* renamed from: d */
    public Context f254388d;

    /* renamed from: e */
    private boolean f254389e = true;

    public C91093c(Context context) {
        this.f254386b = context;
        boolean z = false;
        while (!z && (context instanceof ContextWrapper)) {
            z = context instanceof Activity;
            context = ((ContextWrapper) context).getBaseContext();
        }
        this.f254387c = !z;
    }

    /* renamed from: g */
    private final Bundle m148826g(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(this.f254386b.getClassLoader());
        }
        return extras;
    }

    /* renamed from: n */
    protected static final void m148827n(Intent intent, SecurityException securityException) {
        ((C59052c) ((C59052c) ((C59052c) f254385a.mo56225c()).mo56382g(securityException)).mo56372aa(11446)).mo56389s("Cannot start activity: %s", intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo65089a(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "sender"
            boolean r1 = r7.mo85363m(r8)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00e2
            java.lang.String r1 = r8.getPackage()     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "is_using_assisted_app_package"
            boolean r4 = r8.getBooleanExtra(r4, r3)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "com.google.android.apps.maps"
            boolean r4 = r4.equals(r1)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r4 == 0) goto L_0x004d
            r8.removeExtra(r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.content.Context r4 = r7.f254386b     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            java.lang.Class r5 = r7.getClass()     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r1.<init>(r4, r5)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.content.Context r4 = r7.f254386b     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r1 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240896b(r1, r5, r3)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r4, r3, r1, r5)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r8.putExtra(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.content.Context r0 = r7.f254386b     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            java.lang.String r1 = com.google.android.apps.gsa.shared.util.p7169g.C91038a.m148714a(r8, r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r1 == 0) goto L_0x0060
        L_0x004d:
            java.lang.String r0 = r8.getPackage()     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            boolean r0 = r1.equals(r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r0 != 0) goto L_0x0060
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r0.<init>(r8)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r0.setPackage(r1)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r8 = r0
        L_0x0060:
            java.lang.String r0 = "com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED"
            boolean r0 = r8.hasExtra(r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE"
            android.os.Parcelable r0 = r8.getParcelableExtra(r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            com.google.android.apps.gsa.shared.util.C90772bp.m148299g(r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
        L_0x0073:
            boolean r0 = r7.f254387c     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r0 == 0) goto L_0x007c
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r8.addFlags(r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
        L_0x007c:
            android.os.Bundle r0 = r7.mo85360j(r8)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.content.Context r1 = r7.f254388d     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r1 != 0) goto L_0x0086
            android.content.Context r1 = r7.f254386b     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
        L_0x0086:
            java.lang.String r4 = "keyguard"
            java.lang.Object r4 = r1.getSystemService(r4)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            android.app.KeyguardManager r4 = (android.app.KeyguardManager) r4     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            boolean r5 = r4.isKeyguardLocked()     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r5 == 0) goto L_0x00aa
            boolean r5 = r4.isDeviceLocked()     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r5 != 0) goto L_0x00aa
            boolean r5 = r1 instanceof android.app.Activity     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            if (r5 == 0) goto L_0x00aa
            r5 = r1
            android.app.Activity r5 = (android.app.Activity) r5     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            com.google.android.apps.gsa.shared.util.t.b r6 = new com.google.android.apps.gsa.shared.util.t.b     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r6.<init>(r1, r8, r0)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r4.requestDismissKeyguard(r5, r6)     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            goto L_0x00af
        L_0x00aa:
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
            r1.startActivity(r8, r0)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            return r2
        L_0x00b0:
            r0 = move-exception
            throw r0     // Catch:{ ActivityNotFoundException -> 0x00b4, SecurityException -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            goto L_0x00b6
        L_0x00b4:
            goto L_0x00ba
        L_0x00b6:
            m148827n(r8, r0)
            goto L_0x00da
        L_0x00ba:
            com.google.common.f.e r0 = f254385a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "No activity found for %s"
            r4 = 11451(0x2cbb, float:1.6046E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r1, r8)
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r0 = r8.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00da
            boolean r0 = r7.mo85362l(r0)
            if (r0 == 0) goto L_0x00da
            return r2
        L_0x00da:
            android.content.Intent[] r0 = new android.content.Intent[r2]
            r0[r3] = r8
            r7.mo85361k(r0)
            return r3
        L_0x00e2:
            com.google.common.f.e r0 = f254385a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Can't use startActivityForResult."
            r4 = 11452(0x2cbc, float:1.6048E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r1)
            android.content.Intent[] r0 = new android.content.Intent[r2]
            r0[r3] = r8
            r7.mo85361k(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.p7184t.C91093c.mo65089a(android.content.Intent):boolean");
    }

    /* renamed from: b */
    public boolean mo65090b(Intent intent, C91096f fVar) {
        return false;
    }

    /* renamed from: c */
    public boolean mo65091c(IntentSender intentSender, C91096f fVar) {
        return false;
    }

    /* renamed from: d */
    public boolean mo65092d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo65093e() {
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo65094f(Intent intent, Bundle bundle) {
        C91094d.m148838a(this, intent, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Bundle mo85360j(Intent intent) {
        Bundle g = m148826g(intent);
        Bundle bundle = null;
        if (g == null) {
            return null;
        }
        int i = g.getInt("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 0);
        if (i != 1) {
            if (i == 2) {
                bundle = ActivityOptions.makeCustomAnimation(this.f254386b, 0, 0).toBundle();
            } else if (i == 3) {
                bundle = g.getBundle("com.google.android.apps.gsa.shared.util.starter.IntentStarter.CUSTOM_TRANSITION");
            } else if (i == 4) {
                Resources.Theme newTheme = this.f254386b.getResources().newTheme();
                newTheme.applyStyle(16973825, true);
                TypedValue typedValue = new TypedValue();
                newTheme.resolveAttribute(16842936, typedValue, true);
                int i2 = typedValue.resourceId;
                newTheme.resolveAttribute(16842937, typedValue, true);
                bundle = ActivityOptions.makeCustomAnimation(this.f254386b, i2, typedValue.resourceId).toBundle();
            }
        } else if (this.f254389e) {
            bundle = ActivityOptions.makeCustomAnimation(this.f254386b, R.anim.fast_fade_in, R.anim.fast_fade_out).toBundle();
        } else {
            bundle = ActivityOptions.makeCustomAnimation(this.f254386b, 0, 0).toBundle();
        }
        Rect rect = (Rect) g.getParcelable("com.google.android.apps.gsa.shared.util.starter.IntentStarter.LAUNCH_BOUNDS");
        if (rect == null) {
            return bundle;
        }
        if (bundle == null) {
            return ActivityOptions.makeBasic().setLaunchBounds(rect).toBundle();
        }
        bundle.putParcelable("android:activity.launchBounds", new Rect(rect));
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo85361k(Intent... intentArr) {
        for (int i = 0; i <= 0; i++) {
            int intExtra = intentArr[i].getIntExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.ERROR_TOAST_ID", 0);
            if (intExtra != 0) {
                Toast.makeText(this.f254386b, intExtra, 0).show();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f254385a.mo56226d()).mo56372aa(11448)).mo56389s("No activity found for %s", r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo85362l(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            android.content.Intent r5 = com.google.android.libraries.gsa.util.p1935a.C23336a.m43768a(r5)     // Catch:{ URISyntaxException -> 0x0027 }
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.content.Context r1 = r4.f254386b     // Catch:{ ActivityNotFoundException -> 0x0010 }
            r1.startActivity(r5)     // Catch:{ ActivityNotFoundException -> 0x0010 }
            r5 = 1
            return r5
        L_0x000e:
            r5 = move-exception
            goto L_0x0026
        L_0x0010:
            com.google.common.f.e r1 = f254385a     // Catch:{ all -> 0x000e }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x000e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x000e }
            r2 = 11448(0x2cb8, float:1.6042E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x000e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x000e }
            java.lang.String r2 = "No activity found for %s"
            r1.mo56389s(r2, r5)     // Catch:{ all -> 0x000e }
            return r0
        L_0x0026:
            throw r5
        L_0x0027:
            com.google.common.f.e r1 = f254385a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Invalid fallback Url=%s"
            r3 = 11449(0x2cb9, float:1.6043E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.p7184t.C91093c.mo85362l(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo85363m(Intent intent) {
        Bundle g = m148826g(intent);
        if (g == null || !g.getBoolean("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", false)) {
            return false;
        }
        g.remove("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT");
        return true;
    }
}
