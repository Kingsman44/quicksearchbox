package com.google.android.apps.gsa.shared.p7025bh.p7026a;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90506n;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.util.C91041i;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.bh.a.a */
/* compiled from: PG */
public final class C89429a {

    /* renamed from: a */
    public static final C59071e f242423a = C59071e.m91332i("com.google.android.apps.gsa.shared.bh.a.a");

    /* renamed from: A */
    public static Intent m145439A(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(str2);
        intent.setClassName(context, "com.google.android.apps.gsa.queryentry.QueryEntryActivity");
        intent.setFlags(268435456);
        if (z) {
            intent.putExtra("DISABLE_ENTERING_TRANSITION", true);
        }
        intent.addFlags(32768);
        intent.putExtra("source", str);
        return intent;
    }

    /* renamed from: B */
    public static Intent m145440B(Context context, String str) {
        return m145439A(context, str, "android.intent.action.VOICE_ASSIST", false);
    }

    /* renamed from: C */
    public static boolean m145441C(Intent intent) {
        String action = intent.getAction();
        return TextUtils.equals(action, "android.intent.action.WEB_SEARCH") || TextUtils.equals(action, "com.google.android.googlequicksearchbox.GOOGLE_SEARCH") || TextUtils.equals(action, "com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH") || m145457o(intent) || m145465w(intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.gsa.shared.search.Query} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.gsa.shared.search.Query} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.google.android.apps.gsa.shared.search.Query} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: com.google.android.apps.gsa.shared.search.Query} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v17, types: [com.google.android.apps.gsa.shared.search.Query] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: type inference failed for: r2v52 */
    /* JADX WARNING: type inference failed for: r2v53 */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: type inference failed for: r2v55 */
    /* JADX WARNING: type inference failed for: r2v56 */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v58 */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: type inference failed for: r2v62 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: type inference failed for: r2v65 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.shared.search.Query m145442D(android.content.Intent r13, dagger.C68214a r14, com.google.common.base.C58881cr r15) {
        /*
            boolean r0 = m145441C(r13)
            r1 = 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = m145451i(r13)
            boolean r0 = r13.hasExtra(r0)
            if (r0 == 0) goto L_0x0156
            java.lang.CharSequence r0 = m145449g(r13)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = ""
        L_0x001b:
            r5 = r0
            com.google.android.apps.gsa.shared.search.b.g r6 = m145448f(r13)
            if (r6 == 0) goto L_0x0048
            int r0 = r6.f252886a
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003a
            com.google.bb.a.pb r0 = r6.f252901p
            if (r0 != 0) goto L_0x0030
            com.google.bb.a.pb r0 = com.google.p4152bb.p4153a.C55349pb.f145830g
        L_0x0030:
            r7 = r0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r11 = r14
            com.google.android.apps.gsa.search.shared.actions.ActionData r2 = com.google.android.apps.gsa.search.shared.actions.ActionData.m141431u(r7, r8, r9, r10, r11, r12)
        L_0x003a:
            r7 = r2
            com.google.android.apps.gsa.shared.search.Query r4 = com.google.android.apps.gsa.shared.search.Query.f252741b
            boolean r8 = m145455m(r13)
            r9 = r15
            com.google.android.apps.gsa.shared.search.Query r2 = r4.mo84252O(r5, r6, r7, r8, r9)
            goto L_0x0156
        L_0x0048:
            boolean r14 = m145455m(r13)
            if (r14 == 0) goto L_0x005b
            com.google.android.apps.gsa.shared.search.Query r4 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.b.g r6 = com.google.android.apps.gsa.shared.search.p7138b.C90491g.f252884z
            r7 = 0
            r8 = 1
            r9 = r15
            com.google.android.apps.gsa.shared.search.Query r2 = r4.mo84252O(r5, r6, r7, r8, r9)
            goto L_0x0156
        L_0x005b:
            java.lang.String r14 = "show_full_bleed_suggest_from_lg_plate"
            boolean r14 = r13.hasExtra(r14)
            if (r14 == 0) goto L_0x006b
            com.google.android.apps.gsa.shared.search.Query r14 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r2 = r14.mo84268aE(r5, r3)
            goto L_0x0156
        L_0x006b:
            java.lang.String r14 = m145450h(r13)
            if (r14 == 0) goto L_0x007d
            com.google.android.apps.gsa.shared.search.Query r15 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r15 = r15.mo84268aE(r5, r3)
            com.google.android.apps.gsa.shared.search.Query r2 = r15.mo84305aq(r14)
            goto L_0x0156
        L_0x007d:
            com.google.android.apps.gsa.shared.search.b.g r14 = com.google.android.apps.gsa.shared.search.p7138b.C90491g.f252884z
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.gsa.shared.search.b.e r14 = (com.google.android.apps.gsa.shared.search.p7138b.C90489e) r14
            java.lang.String r0 = "search_immersive_base_page"
            java.lang.String r2 = r13.getStringExtra(r0)
            if (r2 == 0) goto L_0x00a3
            java.lang.String r0 = r13.getStringExtra(r0)
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.android.apps.gsa.shared.search.b.g r2 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r2
            r0.getClass()
            int r4 = r2.f252886a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r2.f252886a = r4
            r2.f252895j = r0
        L_0x00a3:
            java.lang.String r0 = "search-miniapp-landing-page"
            java.lang.String r2 = r13.getStringExtra(r0)
            if (r2 == 0) goto L_0x00c1
            java.lang.String r0 = r13.getStringExtra(r0)
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.android.apps.gsa.shared.search.b.g r2 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r2
            r0.getClass()
            int r4 = r2.f252886a
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r2.f252886a = r4
            r2.f252897l = r0
        L_0x00c1:
            java.lang.String r0 = "search-stick"
            java.lang.String r2 = r13.getStringExtra(r0)
            if (r2 == 0) goto L_0x00de
            java.lang.String r0 = r13.getStringExtra(r0)
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.android.apps.gsa.shared.search.b.g r2 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r2
            r0.getClass()
            int r4 = r2.f252886a
            r1 = r1 | r4
            r2.f252886a = r1
            r2.f252888c = r0
        L_0x00de:
            java.lang.String r0 = "parent-event-id"
            java.lang.String r1 = r13.getStringExtra(r0)
            if (r1 == 0) goto L_0x00fd
            java.lang.String r0 = r13.getStringExtra(r0)
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.android.apps.gsa.shared.search.b.g r1 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r1
            r0.getClass()
            int r2 = r1.f252886a
            r4 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r4
            r1.f252886a = r2
            r1.f252906u = r0
        L_0x00fd:
            java.lang.String r0 = "is-assistant-search-handover"
            boolean r0 = r13.getBooleanExtra(r0, r3)
            r1 = 1
            if (r0 == 0) goto L_0x0116
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.android.apps.gsa.shared.search.b.g r0 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r0
            int r2 = r0.f252886a
            r4 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r4
            r0.f252886a = r2
            r0.f252907v = r1
        L_0x0116:
            java.lang.String r0 = "oi"
            java.lang.String r2 = r13.getStringExtra(r0)
            if (r2 == 0) goto L_0x013c
            java.lang.String r0 = r13.getStringExtra(r0)
            r0.getClass()
            java.lang.String r2 = "ddle"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x013c
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.android.apps.gsa.shared.search.b.g r0 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r0
            int r2 = r0.f252886a
            r2 = r2 | 8
            r0.f252886a = r2
            r0.f252890e = r1
        L_0x013c:
            com.google.android.apps.gsa.shared.search.Query r0 = com.google.android.apps.gsa.shared.search.Query.f252741b
            java.lang.String r1 = "select_query"
            boolean r1 = r13.getBooleanExtra(r1, r3)
            com.google.android.apps.gsa.shared.search.Query r4 = r0.mo84251N(r5, r1)
            com.google.protobuf.bv r14 = r14.build()
            r6 = r14
            com.google.android.apps.gsa.shared.search.b.g r6 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r6
            r7 = 0
            r8 = 0
            r9 = r15
            com.google.android.apps.gsa.shared.search.Query r2 = r4.mo84252O(r5, r6, r7, r8, r9)
        L_0x0156:
            if (r2 == 0) goto L_0x024f
            java.lang.String r14 = "query-header-visibility"
            int r15 = r13.getIntExtra(r14, r3)
            if (r15 == 0) goto L_0x0165
            com.google.android.apps.gsa.shared.search.Query r14 = r2.mo84311aw(r14, r15)
            r2 = r14
        L_0x0165:
            java.lang.String r14 = "ved"
            java.lang.String r14 = r13.getStringExtra(r14)
            if (r14 == 0) goto L_0x024f
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo84344bc(r14)
            goto L_0x024f
        L_0x0173:
            boolean r14 = m145467y(r13)
            if (r14 == 0) goto L_0x01e2
            boolean r14 = m145463u(r13)
            if (r14 != 0) goto L_0x01e2
            java.lang.String r14 = "com.google.android.googlequicksearchbox.VOICE_SEARCH_RECORDED_AUDIO"
            java.lang.String r15 = r13.getAction()
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x019f
            android.content.ComponentName r14 = r13.getComponent()
            java.lang.String r14 = r14.getClassName()
            java.lang.String r15 = "com.google.android.googlequicksearchbox.RecordedVoiceSearchActivity"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x019f
            android.net.Uri r2 = r13.getData()
        L_0x019f:
            r5 = r2
            if (r5 == 0) goto L_0x01cd
            java.lang.String r14 = "mimicGearheadQuery"
            boolean r14 = r13.getBooleanExtra(r14, r3)
            if (r14 == 0) goto L_0x01bf
            com.google.android.apps.gsa.shared.search.Query r4 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r6 = 16000(0x3e80, float:2.2421E-41)
            r7 = 0
            r8 = 0
            java.lang.String r14 = "user-agent-suffix"
            java.lang.String r10 = r13.getStringExtra(r14)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r11 = com.google.android.apps.gsa.shared.search.QueryTriggerType.GEARHEAD_HARDWARE_MIC
            com.google.android.apps.gsa.shared.search.Query r2 = r4.mo84443dX(r5, r6, r7, r8, r10, r11)
            goto L_0x024f
        L_0x01bf:
            boolean r14 = m145462t(r13)
            com.google.android.apps.gsa.shared.search.Query r15 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r0 = 8000(0x1f40, float:1.121E-41)
            com.google.android.apps.gsa.shared.search.Query r2 = r15.mo84298aj(r5, r0, r14)
            goto L_0x024f
        L_0x01cd:
            boolean r14 = m145454l(r13)
            if (r14 == 0) goto L_0x01db
            com.google.android.apps.gsa.shared.search.Query r14 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r2 = r14.mo84295ag(r3, r3, r3)
            goto L_0x024f
        L_0x01db:
            com.google.android.apps.gsa.shared.search.Query r14 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r2 = r14.mo84294af()
            goto L_0x024f
        L_0x01e2:
            boolean r14 = m145464v(r13)
            if (r14 == 0) goto L_0x024f
            boolean r14 = m145463u(r13)
            if (r14 != 0) goto L_0x024f
            java.lang.String r14 = "extra_referrer"
            java.lang.String r14 = r13.getStringExtra(r14)
            java.lang.String r15 = "com.google.android.ears"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x020f
            com.google.android.apps.gsa.shared.search.Query r14 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.f r14 = r14.mo84480i()
            r14.mo84562U(r1)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r15 = com.google.android.apps.gsa.shared.search.QueryTriggerType.GOOGLEEARS_WIDGET
            r14.mo84561T(r15)
            com.google.android.apps.gsa.shared.search.Query r2 = r14.mo84568a()
            goto L_0x024f
        L_0x020f:
            android.content.ClipData r14 = r13.getClipData()
            if (r14 == 0) goto L_0x0225
            int r15 = r14.getItemCount()
            if (r15 <= 0) goto L_0x0225
            android.content.ClipData$Item r14 = r14.getItemAt(r3)
            if (r14 == 0) goto L_0x0225
            android.net.Uri r2 = r14.getUri()
        L_0x0225:
            if (r2 != 0) goto L_0x023a
            com.google.android.apps.gsa.shared.search.Query r14 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.f r14 = r14.mo84480i()
            r14.mo84562U(r1)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r15 = com.google.android.apps.gsa.shared.search.QueryTriggerType.INTENT
            r14.mo84561T(r15)
            com.google.android.apps.gsa.shared.search.Query r2 = r14.mo84568a()
            goto L_0x024f
        L_0x023a:
            com.google.android.apps.gsa.shared.search.Query r14 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.QueryTriggerType r15 = com.google.android.apps.gsa.shared.search.QueryTriggerType.MUSIC_SEARCH_INTENT
            com.google.android.apps.gsa.shared.search.f r14 = r14.mo84480i()
            r14.mo84562U(r1)
            r14.mo84561T(r15)
            r14.mo84547F(r2, r3, r3)
            com.google.android.apps.gsa.shared.search.Query r2 = r14.mo84568a()
        L_0x024f:
            if (r2 != 0) goto L_0x0257
            com.google.android.apps.gsa.shared.search.Query r14 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r2 = r14.mo84259V()
        L_0x0257:
            java.lang.String r13 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r13)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L_0x0264
            java.lang.String r13 = "and.gsa.d.viu"
            goto L_0x0270
        L_0x0264:
            java.lang.String r14 = "and.gsa.widget.text"
            boolean r14 = r14.equals(r13)
            if (r14 == 0) goto L_0x0270
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo84250M()
        L_0x0270:
            com.google.android.apps.gsa.shared.search.Query r13 = r2.mo84275aL(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145442D(android.content.Intent, dagger.a, com.google.common.base.cr):com.google.android.apps.gsa.shared.search.Query");
    }

    /* renamed from: a */
    public static Intent m145443a(Context context, String str) {
        Intent className = new Intent("android.intent.action.ASSIST").setClassName(context, e.b());
        if (str != null) {
            className.putExtra("source", str);
        } else {
            ((C59052c) ((C59052c) f242423a.mo56225c()).mo56372aa(11463)).mo56386p("No source provided when constructing assistant intent.");
        }
        return className;
    }

    /* renamed from: b */
    public static Intent m145444b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName(context, str));
        return intent;
    }

    /* renamed from: c */
    public static Intent m145445c(Context context, String str) {
        Intent className = new Intent("android.intent.action.MAIN").setClassName(context, "com.google.android.googlequicksearchbox.SearchActivity");
        className.putExtra("source", str);
        return className;
    }

    /* renamed from: d */
    public static Intent m145446d(Context context, Query query) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH");
        intent.setClassName(context, e.b());
        intent.putExtra("velvet-query", query);
        intent.putExtra("commit-query", true);
        intent.putExtra("scrim_transition_to_solid", true);
        return intent;
    }

    /* renamed from: e */
    public static ResolveInfo m145447e(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        PackageManager packageManager = context.getPackageManager();
        C90476a aVar = C91018d.f254254a;
        return packageManager.resolveActivity(intent, 65536);
    }

    /* renamed from: f */
    public static C90491g m145448f(Intent intent) {
        String stringExtra;
        if (!intent.hasExtra("search-options-proto") || (stringExtra = intent.getStringExtra("search-options-proto")) == null) {
            return null;
        }
        try {
            return (C90491g) C62942bv.parseFrom((C62942bv) C90491g.f252884z, Base64.decode(stringExtra, 11));
        } catch (C62974ct | IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C90506n.f253010a.mo56225c()).mo56382g(e)).mo56372aa(11025)).mo56386p("Unable to parse SearchOptionsProto from intent extras.");
            return null;
        }
    }

    /* renamed from: g */
    public static CharSequence m145449g(Intent intent) {
        Object obj = intent.getExtras().get(m145451i(intent));
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (r10.equals("web") != false) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cf  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m145450h(android.content.Intent r10) {
        /*
            java.lang.String r0 = "search_within_corpus"
            boolean r1 = r10.hasExtra(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r10 = r10.getStringExtra(r0)
            int r0 = r10.hashCode()
            r1 = 0
            java.lang.String r3 = "web.app"
            java.lang.String r4 = "web.isch"
            r5 = -1
            r6 = 1
            r7 = 2
            java.lang.String r8 = "web"
            switch(r0) {
                case -764028567: goto L_0x0079;
                case -763880587: goto L_0x006f;
                case -763740848: goto L_0x0065;
                case 101486: goto L_0x005b;
                case 107868: goto L_0x0051;
                case 117588: goto L_0x0048;
                case 1222272135: goto L_0x0040;
                case 1222272944: goto L_0x0036;
                case 1222284848: goto L_0x002c;
                case 1222292087: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0081
        L_0x0021:
            java.lang.String r0 = "web.vid"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0081
            r0 = 8
            goto L_0x0082
        L_0x002c:
            java.lang.String r0 = "web.nws"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0081
            r0 = 6
            goto L_0x0082
        L_0x0036:
            java.lang.String r0 = "web.bks"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0081
            r0 = 1
            goto L_0x0082
        L_0x0040:
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x0081
            r0 = 0
            goto L_0x0082
        L_0x0048:
            boolean r0 = r10.equals(r8)
            if (r0 == 0) goto L_0x0081
            r0 = 9
            goto L_0x0082
        L_0x0051:
            java.lang.String r0 = "map"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0081
            r0 = 4
            goto L_0x0082
        L_0x005b:
            java.lang.String r0 = "flt"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0081
            r0 = 2
            goto L_0x0082
        L_0x0065:
            java.lang.String r0 = "web.shop"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0081
            r0 = 7
            goto L_0x0082
        L_0x006f:
            java.lang.String r0 = "web.nrby"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0081
            r0 = 5
            goto L_0x0082
        L_0x0079:
            boolean r0 = r10.equals(r4)
            if (r0 == 0) goto L_0x0081
            r0 = 3
            goto L_0x0082
        L_0x0081:
            r0 = -1
        L_0x0082:
            switch(r0) {
                case 0: goto L_0x008a;
                case 1: goto L_0x008a;
                case 2: goto L_0x008a;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x008a;
                case 6: goto L_0x008a;
                case 7: goto L_0x008a;
                case 8: goto L_0x008a;
                case 9: goto L_0x008a;
                default: goto L_0x0085;
            }
        L_0x0085:
            int r0 = r10.hashCode()
            goto L_0x008b
        L_0x008a:
            return r10
        L_0x008b:
            r9 = -1185250696(0xffffffffb95a8278, float:-2.0838703E-4)
            if (r0 == r9) goto L_0x00ac
            r9 = 117588(0x1cb54, float:1.64776E-40)
            if (r0 == r9) goto L_0x00a5
            r1 = 3000946(0x2dca72, float:4.205221E-39)
            if (r0 == r1) goto L_0x009b
            goto L_0x00b6
        L_0x009b:
            java.lang.String r0 = "apps"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b6
            r1 = 2
            goto L_0x00b7
        L_0x00a5:
            boolean r0 = r10.equals(r8)
            if (r0 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00ac:
            java.lang.String r0 = "images"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b6
            r1 = 1
            goto L_0x00b7
        L_0x00b6:
            r1 = -1
        L_0x00b7:
            if (r1 == 0) goto L_0x00cf
            if (r1 == r6) goto L_0x00cd
            if (r1 == r7) goto L_0x00cb
            com.google.common.f.e r0 = f242423a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Invalid input of corpus string: %s is not supported."
            r3 = 11470(0x2cce, float:1.6073E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r10)
            goto L_0x00d0
        L_0x00cb:
            r2 = r3
            goto L_0x00d0
        L_0x00cd:
            r2 = r4
            goto L_0x00d0
        L_0x00cf:
            r2 = r8
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145450h(android.content.Intent):java.lang.String");
    }

    /* renamed from: i */
    public static String m145451i(Intent intent) {
        String action = intent.getAction();
        return ("android.intent.action.SEND".equals(action) || TextUtils.equals(action, "com.google.android.googlequicksearchbox.TEXT_ASSIST")) ? "android.intent.extra.TEXT" : "query";
    }

    /* renamed from: j */
    public static void m145452j(Intent intent) {
        intent.addFlags(268435456);
        intent.addFlags(8192);
    }

    /* renamed from: k */
    public static boolean m145453k(Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.google.android.googlequicksearchbox.TEXT_ASSIST") || TextUtils.equals(intent.getAction(), "android.intent.action.VOICE_ASSIST")) {
            return true;
        }
        if (!"android.intent.action.ASSIST".equals(intent.getAction()) || !intent.getBooleanExtra("android.intent.extra.ASSIST_INPUT_HINT_KEYBOARD", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m145454l(Intent intent) {
        return "bvra".equals(C39193b.m68624a(intent));
    }

    /* renamed from: m */
    public static boolean m145455m(Intent intent) {
        return "and.gsa.now.widget".equals(C39193b.m68624a(intent));
    }

    /* renamed from: n */
    public static boolean m145456n(Context context, ResolveInfo resolveInfo) {
        String packageName = context.getPackageName();
        if (resolveInfo == null || resolveInfo.activityInfo == null || resolveInfo.activityInfo.applicationInfo == null) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!packageName.equals(resolveInfo.activityInfo.applicationInfo.packageName) || !"com.google.android.launcher.GEL".equals(resolveInfo.activityInfo.name)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    public static boolean m145457o(Intent intent) {
        return TextUtils.equals(intent.getAction(), "android.search.action.GLOBAL_SEARCH");
    }

    /* renamed from: p */
    public static boolean m145458p(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.toLowerCase(Locale.US).startsWith("http");
    }

    /* renamed from: q */
    public static boolean m145459q(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.toLowerCase(Locale.US).startsWith("intent");
    }

    /* renamed from: r */
    public static boolean m145460r(Intent intent) {
        return TextUtils.equals(intent.getAction(), "com.google.android.googlequicksearchbox.OPEN_ACCOUNT_CHOOSER");
    }

    /* renamed from: s */
    public static boolean m145461s(ResolveInfo resolveInfo) {
        if (resolveInfo == null || resolveInfo.activityInfo == null || !"com.google.android.apps.nexuslauncher".equals(resolveInfo.activityInfo.packageName) || !"com.google.android.apps.nexuslauncher.NexusLauncherActivity".equals(resolveInfo.activityInfo.name)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m145462t(Intent intent) {
        return intent.getBooleanExtra("reopenForFollowOn", false);
    }

    /* renamed from: u */
    public static boolean m145463u(Intent intent) {
        return (intent.getFlags() & 1048576) != 0;
    }

    /* renamed from: v */
    public static boolean m145464v(Intent intent) {
        return "com.google.android.googlequicksearchbox.MUSIC_SEARCH".equals(intent.getAction());
    }

    /* renamed from: w */
    public static boolean m145465w(Intent intent) {
        return TextUtils.equals(intent.getAction(), "com.google.android.googlequicksearchbox.TEXT_ASSIST") && intent.hasExtra(m145451i(intent));
    }

    /* renamed from: x */
    public static boolean m145466x(Intent intent) {
        return TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || TextUtils.equals(intent.getAction(), "android.intent.action.ASSIST");
    }

    /* renamed from: y */
    public static boolean m145467y(Intent intent) {
        String action = intent.getAction();
        return "android.intent.action.SEARCH_LONG_PRESS".equals(action) || "android.speech.action.WEB_SEARCH".equals(action) || "com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH".equals(action) || "android.intent.action.VOICE_ASSIST".equals(action) || "com.google.android.googlequicksearchbox.VOICE_SEARCH_RECORDED_AUDIO".equals(action);
    }

    /* renamed from: z */
    public static void m145468z(Context context, Intent intent, boolean z, String str) {
        PackageManager packageManager = context.getPackageManager();
        C90476a aVar = C91018d.f254254a;
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        boolean a = (resolveActivity == null || resolveActivity.activityInfo == null) ? false : C91041i.m148716a(resolveActivity.activityInfo.packageName);
        intent.putExtra("com.android.chrome.preserve_task", true);
        intent.addFlags(268435456);
        if (a && z) {
            intent.putExtra("com.google.chrome.transition_type", 1);
        }
        if (str != null && str.equals(intent.getPackage())) {
            intent.putExtra("com.google.android.googlequicksearchbox.extra.intent_to_assist_package", true);
        }
        if (a) {
            intent.putExtra("trusted_application_code_extra", PendingIntent.getActivity(context, 0, new Intent(), 67108864));
            intent.putExtra("com.android.browser.application_id", context.getPackageName());
            intent.putExtra("create_new_tab", true);
        }
    }
}
