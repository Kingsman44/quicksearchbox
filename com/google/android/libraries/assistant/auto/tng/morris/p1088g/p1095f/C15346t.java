package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14283dm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14284dn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14289ds;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.p1478e.p1479a.p1480a.C17939a;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.assistant.p3745ab.p3766r.C48385a;
import com.google.assistant.p3745ab.p3766r.C48390f;
import com.google.assistant.p3745ab.p3766r.C48391g;
import com.google.assistant.p3745ab.p3766r.C48392h;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.t */
/* compiled from: PG */
public final class C15346t {

    /* renamed from: a */
    public static final C58495hd f46047a;

    /* renamed from: b */
    private static final C59071e f46048b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.f.t");

    /* renamed from: c */
    private static final C58495hd f46049c;

    /* renamed from: d */
    private static final C58495hd f46050d;

    /* renamed from: e */
    private final Context f46051e;

    /* renamed from: f */
    private final C15352z f46052f;

    /* renamed from: g */
    private final PackageManager f46053g;

    /* renamed from: h */
    private final C86124t f46054h;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C14284dn.PLAY, Integer.valueOf(R.drawable.media_player_play_button));
        gzVar.mo55429h(C14284dn.PAUSE, Integer.valueOf(R.drawable.media_player_pause_button));
        gzVar.mo55429h(C14284dn.STOP, Integer.valueOf(R.drawable.media_player_stop_button));
        gzVar.mo55429h(C14284dn.BACKWARD, Integer.valueOf(R.drawable.media_player_back_10));
        gzVar.mo55429h(C14284dn.PREV, Integer.valueOf(R.drawable.media_player_prev_button));
        gzVar.mo55429h(C14284dn.FORWARD, Integer.valueOf(R.drawable.media_player_forward_30));
        gzVar.mo55429h(C14284dn.NEXT, Integer.valueOf(R.drawable.media_player_next_button));
        f46047a = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C14284dn.PLAY, Integer.valueOf(R.string.media_player_play_label));
        gzVar2.mo55429h(C14284dn.PAUSE, Integer.valueOf(R.string.media_player_pause_label));
        gzVar2.mo55429h(C14284dn.STOP, Integer.valueOf(R.string.media_player_stop_label));
        gzVar2.mo55429h(C14284dn.NEXT, Integer.valueOf(R.string.media_player_next_label));
        gzVar2.mo55429h(C14284dn.FORWARD, Integer.valueOf(R.string.media_player_forward_label));
        gzVar2.mo55429h(C14284dn.PREV, Integer.valueOf(R.string.media_player_play_previous_label));
        gzVar2.mo55429h(C14284dn.BACKWARD, Integer.valueOf(R.string.media_player_rewind_label));
        f46049c = gzVar2.mo55427f(false);
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h(new Pair("com.spotify.music", "ADD_TO_COLLECTION"), Integer.valueOf(R.string.media_player_like_this_track));
        gzVar3.mo55429h(new Pair("com.spotify.music", "START_RADIO"), Integer.valueOf(R.string.media_player_start_radio));
        gzVar3.mo55429h(new Pair("com.spotify.music", "TURN_REPEAT_ALL_ON"), Integer.valueOf(R.string.media_player_turn_repeat_all_on));
        gzVar3.mo55429h(new Pair("com.spotify.music", "TURN_REPEAT_ALL_OFF"), Integer.valueOf(R.string.media_player_turn_repeat_all_off));
        f46050d = gzVar3.mo55427f(false);
    }

    public C15346t(Context context, C15352z zVar, C86124t tVar) {
        this.f46051e = context;
        this.f46053g = context.getPackageManager();
        this.f46052f = zVar;
        this.f46054h = tVar;
    }

    /* renamed from: c */
    public static C37252a m31929c(C14292dv dvVar) {
        if (!dvVar.f43243i.isEmpty() || !dvVar.f43249o.isEmpty() || (dvVar.f43244j == null && dvVar.f43245k.isEmpty())) {
            return C37182a.f97843bV.mo40813g();
        }
        return C37182a.f98190hy.mo40813g();
    }

    /* renamed from: n */
    private final boolean m31930n(ImageView imageView, String str, int i) {
        Optional optional;
        try {
            optional = Optional.m71637of(this.f46053g.getResourcesForApplication(str));
        } catch (PackageManager.NameNotFoundException e) {
            C59104x c = f46048b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46058)).mo56389s("Package name %s not found while getting remote resources.", str);
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            return false;
        }
        try {
            imageView.setImageDrawable(((Resources) optional.get()).getDrawable(i));
            return true;
        } catch (Resources.NotFoundException e2) {
            C59104x c2 = f46048b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(46075)).mo56386p("Could not find the button resource for remote resources.");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b mo22212a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Morris.BitmapUtils"
            com.google.android.libraries.assistant.auto.tng.morris.e.b r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.a r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14189a) r1
            j$.util.Optional r2 = r10.mo22214d(r11, r12)
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x0082
            java.lang.Object r2 = r2.get()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r3 = 0
            int r4 = r2.getIntrinsicWidth()     // Catch:{ RuntimeException -> 0x0060 }
            int r5 = r2.getIntrinsicHeight()     // Catch:{ RuntimeException -> 0x0060 }
            if (r4 <= 0) goto L_0x0044
            if (r5 > 0) goto L_0x0028
            goto L_0x0044
        L_0x0028:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ RuntimeException -> 0x0060 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0060 }
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0060 }
            r7.<init>(r6)     // Catch:{ RuntimeException -> 0x0060 }
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0060 }
            r9 = 0
            r8.<init>(r9, r9, r4, r5)     // Catch:{ RuntimeException -> 0x0060 }
            r2.setBounds(r8)     // Catch:{ RuntimeException -> 0x0060 }
            r2.draw(r7)     // Catch:{ RuntimeException -> 0x0060 }
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r3 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31985c(r6)     // Catch:{ RuntimeException -> 0x0060 }
            goto L_0x0074
        L_0x0044:
            com.google.common.f.e r2 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.f46152a     // Catch:{ RuntimeException -> 0x0060 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ RuntimeException -> 0x0060 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0060 }
            r2.mo56378ag(r4, r0)     // Catch:{ RuntimeException -> 0x0060 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ RuntimeException -> 0x0060 }
            r4 = 46091(0xb40b, float:6.4587E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ RuntimeException -> 0x0060 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ RuntimeException -> 0x0060 }
            java.lang.String r4 = "width or height is not correct."
            r2.mo56386p(r4)     // Catch:{ RuntimeException -> 0x0060 }
            goto L_0x0074
        L_0x0060:
            r2 = move-exception
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.f46152a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r0)
            java.lang.String r0 = "Cannot create app icon"
            r5 = 46092(0xb40c, float:6.4589E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r2)).mo56372aa(r5)).mo56386p(r0)
        L_0x0074:
            if (r3 == 0) goto L_0x0082
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r0
            r0.f43010b = r3
            r2 = 3
            r0.f43009a = r2
        L_0x0082:
            java.lang.String r0 = r10.mo22216f(r11, r12)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r2
            r0.getClass()
            r2.f43013e = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r0
            r11.getClass()
            r0.f43011c = r11
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r11
            r12.getClass()
            r11.f43012d = r12
            com.google.protobuf.bv r11 = r1.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t.mo22212a(java.lang.String, java.lang.String):com.google.android.libraries.assistant.auto.tng.morris.e.b");
    }

    /* renamed from: b */
    public final C28353e mo22213b(String str, String str2) {
        C62940bt btVar = C17939a.f51392b;
        C48385a aVar = (C48385a) C48392h.f125083c.createBuilder();
        C48390f fVar = (C48390f) C48391g.f125079c.createBuilder();
        C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
        boVar.copyOnWrite();
        C48260bq bqVar = (C48260bq) boVar.instance;
        str.getClass();
        bqVar.f124827a |= 1;
        bqVar.f124828b = str;
        boVar.copyOnWrite();
        C48260bq bqVar2 = (C48260bq) boVar.instance;
        str2.getClass();
        bqVar2.f124827a |= 2;
        bqVar2.f124829c = str2;
        fVar.copyOnWrite();
        C48391g gVar = (C48391g) fVar.instance;
        C48260bq bqVar3 = (C48260bq) boVar.build();
        bqVar3.getClass();
        gVar.f125082b = bqVar3;
        gVar.f125081a = 2;
        aVar.copyOnWrite();
        C48392h hVar = (C48392h) aVar.instance;
        C48391g gVar2 = (C48391g) fVar.build();
        gVar2.getClass();
        hVar.f125087b = gVar2;
        hVar.f125086a |= 1;
        return new C28353e(btVar, (C48392h) aVar.build());
    }

    /* renamed from: d */
    public final Optional mo22214d(String str, String str2) {
        Resources resources;
        OptionalInt optionalInt;
        OptionalInt optionalInt2;
        ComponentName componentName = new ComponentName(str, str2);
        try {
            resources = this.f46053g.getResourcesForApplication(componentName.getPackageName());
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            C59104x c = f46048b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46054)).mo56389s("Unable to get resources for %s", componentName.getPackageName());
            resources = null;
        }
        try {
            ServiceInfo serviceInfo = this.f46053g.getServiceInfo(componentName, 128);
            if (serviceInfo == null) {
                C58976aa aaVar = C58975e.f156826a;
                optionalInt = OptionalInt.empty();
            } else if (serviceInfo.metaData == null || !serviceInfo.metaData.containsKey("appIcon")) {
                optionalInt = OptionalInt.m71640of(serviceInfo.getIconResource());
            } else {
                optionalInt = OptionalInt.m71640of(serviceInfo.metaData.getInt("appIcon"));
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C59104x c2 = f46048b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(46064)).mo56389s("Service %s doesn't exist", componentName);
            optionalInt = OptionalInt.empty();
        }
        if (!optionalInt.isPresent() || optionalInt.getAsInt() == 0 || resources == null) {
            String packageName = componentName.getPackageName();
            C58976aa aaVar2 = C58975e.f156826a;
            if (packageName.isEmpty()) {
                optionalInt2 = OptionalInt.empty();
            } else {
                try {
                    ApplicationInfo applicationInfo = this.f46053g.getApplicationInfo(packageName, 128);
                    if (applicationInfo == null || applicationInfo.icon == 0) {
                        optionalInt2 = OptionalInt.empty();
                    } else {
                        optionalInt2 = OptionalInt.m71640of(applicationInfo.icon);
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    C59104x c3 = f46048b.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
                    ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(46061)).mo56386p("Unable to update media client package attributes.");
                    optionalInt2 = OptionalInt.empty();
                }
            }
            if (optionalInt2.isPresent() && resources != null) {
                optionalInt2.getAsInt();
                return Optional.m71637of(resources.getDrawable(optionalInt2.getAsInt()));
            } else if (componentName.getPackageName().isEmpty()) {
                return Optional.empty();
            } else {
                try {
                    Drawable applicationIcon = this.f46053g.getApplicationIcon(componentName.getPackageName());
                    if (applicationIcon != null) {
                        return Optional.m71637of(applicationIcon);
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    C59104x c4 = f46048b.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
                    ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e4)).mo56372aa(46055)).mo56386p("Media app icon not found");
                }
                return Optional.empty();
            }
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            optionalInt.getAsInt();
            return Optional.m71637of(resources.getDrawable(optionalInt.getAsInt()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo22215e(android.content.ComponentName r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getClassName()
            java.lang.String r1 = "com.google.android.apps.gsa.staticplugins.mediabrowser.OpaMediaBrowserService"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0017
            android.content.Context r0 = r6.f46051e
            r1 = 2132087155(0x7f151173, float:1.9814557E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0091
        L_0x0017:
            java.lang.String r0 = r7.getClassName()
            java.lang.String r1 = "com.google.android.apps.search.podcasts.browser.PodcastBrowserService"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002d
            android.content.Context r0 = r6.f46051e
            r1 = 2132087175(0x7f151187, float:1.9814598E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0091
        L_0x002d:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f46054h
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248929z
            boolean r0 = r0.mo79746e(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x005f
            android.content.pm.PackageManager r0 = r6.f46053g
            java.lang.String r2 = r7.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r2)
            if (r0 == 0) goto L_0x0059
            android.content.pm.PackageManager r1 = r6.f46053g
            r2 = 0
            android.content.pm.ActivityInfo r0 = r0.resolveActivityInfo(r1, r2)
            android.content.pm.PackageManager r1 = r6.f46053g
            java.lang.CharSequence r0 = r0.loadLabel(r1)
            java.lang.String r0 = r0.toString()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0091
        L_0x0059:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.getPackageName()
            goto L_0x0076
        L_0x005f:
            android.content.pm.PackageManager r0 = r6.f46053g     // Catch:{ NameNotFoundException -> 0x0078 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r0.getServiceInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r0 == 0) goto L_0x0076
            android.content.pm.PackageManager r2 = r6.f46053g     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.CharSequence r0 = r0.loadLabel(r2)     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NameNotFoundException -> 0x0078 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NameNotFoundException -> 0x0074 }
            goto L_0x0091
        L_0x0074:
            r1 = move-exception
            goto L_0x007c
        L_0x0076:
            r0 = r1
            goto L_0x0091
        L_0x0078:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x007c:
            com.google.common.f.e r2 = f46048b
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "Morris.MediaHelper"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Sservice %s doesn't exist"
            r4 = 46066(0xb3f2, float:6.4552E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56389s(r3, r7)
        L_0x0091:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00ac
            java.lang.String r1 = r7.getPackageName()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00ac
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r0 = r6.f46052f
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r7 = r0.mo22227h(r7)
            return r7
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t.mo22215e(android.content.ComponentName):java.lang.String");
    }

    /* renamed from: f */
    public final String mo22216f(String str, String str2) {
        return mo22215e(new ComponentName(str, str2));
    }

    /* renamed from: g */
    public final void mo22217g(View view, C14292dv dvVar, boolean z) {
        String str;
        String str2;
        int a = C14291du.m30597a(dvVar.f43250p);
        if (a != 0 && a == 6) {
            if (z) {
                C14216b bVar = dvVar.f43239e;
                if (bVar == null) {
                    bVar = C14216b.f43007f;
                }
                if (!bVar.f43013e.isEmpty()) {
                    Context context = this.f46051e;
                    Object[] objArr = new Object[1];
                    C14216b bVar2 = dvVar.f43239e;
                    if (bVar2 == null) {
                        bVar2 = C14216b.f43007f;
                    }
                    objArr[0] = bVar2.f43013e;
                    str2 = context.getString(R.string.open_app_content_description, objArr);
                    view.setContentDescription(str2);
                    return;
                }
            }
            Context context2 = this.f46051e;
            Object[] objArr2 = new Object[1];
            C14216b bVar3 = dvVar.f43239e;
            if (bVar3 == null) {
                bVar3 = C14216b.f43007f;
            }
            String str3 = bVar3.f43011c;
            C14216b bVar4 = dvVar.f43239e;
            if (bVar4 == null) {
                bVar4 = C14216b.f43007f;
            }
            objArr2[0] = mo22216f(str3, bVar4.f43012d);
            str2 = context2.getString(R.string.open_app_content_description, objArr2);
            view.setContentDescription(str2);
            return;
        }
        if (z) {
            C14216b bVar5 = dvVar.f43239e;
            if (bVar5 == null) {
                bVar5 = C14216b.f43007f;
            }
            if (!bVar5.f43013e.isEmpty()) {
                Context context3 = this.f46051e;
                Object[] objArr3 = new Object[2];
                objArr3[0] = dvVar.f43241g;
                C14216b bVar6 = dvVar.f43239e;
                if (bVar6 == null) {
                    bVar6 = C14216b.f43007f;
                }
                objArr3[1] = bVar6.f43013e;
                str = context3.getString(R.string.play_media_item_with_app_content_description, objArr3);
                view.setContentDescription(str);
            }
        }
        str = this.f46051e.getString(R.string.play_media_item_content_description, new Object[]{dvVar.f43241g});
        view.setContentDescription(str);
    }

    /* renamed from: h */
    public final void mo22218h(ImageView imageView, C14286dp dpVar, String str, String str2, Map map, C14986h hVar, C14132bf bfVar, C14152v vVar) {
        String str3;
        C14284dn a = C14284dn.m30595a(dpVar.f43218b);
        if (a == null) {
            a = C14284dn.UNRECOGNIZED;
        }
        C14284dn dnVar = C14284dn.CUSTOM_ACTION;
        int i = PrivateKeyType.INVALID;
        if (a == dnVar) {
            imageView.setColorFilter(C1878d.m5128a(this.f46051e, R.color.media_playback_control_button_dark));
            if (!m31930n(imageView, str, dpVar.f43219c)) {
                C59104x c = f46048b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
                ((C59052c) ((C59052c) c).mo56372aa(46070)).mo56387q("Could not find the button resource for custom button. %d", dpVar.f43219c);
            } else {
                Pair pair = new Pair(str, dpVar.f43221e);
                C58495hd hdVar = f46050d;
                if (hdVar.containsKey(pair)) {
                    str3 = this.f46051e.getString(((Integer) hdVar.get(pair)).intValue());
                } else {
                    str3 = dpVar.f43221e;
                }
                imageView.setContentDescription(str3);
                int a2 = C14283dm.m30594a(dpVar.f43217a);
                if (a2 == 0 || a2 != 3) {
                    i = 63;
                }
                imageView.setImageAlpha(i);
            }
        } else {
            C14284dn a3 = C14284dn.m30595a(dpVar.f43218b);
            if (a3 == null) {
                a3 = C14284dn.UNRECOGNIZED;
            }
            if (!map.containsKey(a3)) {
                C59104x c2 = f46048b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Morris.MediaHelper");
                ((C59052c) ((C59052c) c2).mo56372aa(46069)).mo56386p("Could not find the button resource for the button type!");
            } else {
                C14284dn a4 = C14284dn.m30595a(dpVar.f43218b);
                if (a4 == null) {
                    a4 = C14284dn.UNRECOGNIZED;
                }
                Integer num = (Integer) map.get(a4);
                num.getClass();
                imageView.setImageResource(num.intValue());
                Context context = this.f46051e;
                C58495hd hdVar2 = f46049c;
                C14284dn a5 = C14284dn.m30595a(dpVar.f43218b);
                if (a5 == null) {
                    a5 = C14284dn.UNRECOGNIZED;
                }
                Integer num2 = (Integer) hdVar2.get(a5);
                num2.getClass();
                imageView.setContentDescription(context.getString(num2.intValue()));
                int a6 = C14283dm.m30594a(dpVar.f43217a);
                if (a6 == 0 || a6 != 3) {
                    i = 63;
                }
                imageView.setImageAlpha(i);
            }
        }
        imageView.setOnClickListener(new C14129bc(bfVar, Optional.m71637of(new C15345s(dpVar, str, str2)), new C15343q(dpVar, hVar, vVar)));
    }

    /* renamed from: i */
    public final void mo22219i(ImageView imageView) {
        imageView.setImageResource(R.drawable.music_icon);
        imageView.setBackgroundColor(C1878d.m5128a(this.f46051e, R.color.album_art_default));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    /* renamed from: k */
    public final void mo22221k(ImageView imageView, String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        String f = mo22216f(str, str2);
        if (!f.isEmpty()) {
            imageView.setContentDescription(f);
        } else {
            imageView.setContentDescription(this.f46051e.getString(R.string.media_player_app_icon_description));
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Optional d = mo22214d(str, str2);
        if (d.isPresent()) {
            imageView.setImageDrawable((Drawable) d.get());
        } else {
            imageView.setImageResource(R.drawable.quantum_ic_play_music_white_24);
        }
    }

    /* renamed from: l */
    public final void mo22222l(ImageView imageView, C14292dv dvVar) {
        C14361gj gjVar;
        C14216b bVar = dvVar.f43239e;
        if (bVar == null) {
            bVar = C14216b.f43007f;
        }
        int i = bVar.f43009a;
        int i2 = i != 0 ? i != 3 ? i != 4 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C58976aa aaVar = C58975e.f156826a;
            C15352z zVar = this.f46052f;
            C14216b bVar2 = dvVar.f43239e;
            if (bVar2 == null) {
                bVar2 = C14216b.f43007f;
            }
            if (bVar2.f43009a == 3) {
                gjVar = (C14361gj) bVar2.f43010b;
            } else {
                gjVar = C14361gj.f43456e;
            }
            zVar.mo22229l(imageView, gjVar, C15341o.f46038a);
        } else if (i3 == 1) {
            C58976aa aaVar2 = C58975e.f156826a;
            C15352z zVar2 = this.f46052f;
            C14216b bVar3 = dvVar.f43239e;
            if (bVar3 == null) {
                bVar3 = C14216b.f43007f;
            }
            zVar2.mo22231n(imageView, bVar3.f43009a == 4 ? (String) bVar3.f43010b : BuildConfig.FLAVOR, C15342p.f46039a);
        } else if (i3 == 2) {
            C58976aa aaVar3 = C58975e.f156826a;
        }
    }

    /* renamed from: m */
    public final C28353e mo22223m(String str, String str2, int i) {
        C62940bt btVar = C17939a.f51392b;
        C48385a aVar = (C48385a) C48392h.f125083c.createBuilder();
        C48390f fVar = (C48390f) C48391g.f125079c.createBuilder();
        C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
        boVar.copyOnWrite();
        C48260bq bqVar = (C48260bq) boVar.instance;
        str.getClass();
        bqVar.f124827a |= 1;
        bqVar.f124828b = str;
        boVar.copyOnWrite();
        C48260bq bqVar2 = (C48260bq) boVar.instance;
        str2.getClass();
        bqVar2.f124827a |= 2;
        bqVar2.f124829c = str2;
        boVar.copyOnWrite();
        C48260bq bqVar3 = (C48260bq) boVar.instance;
        bqVar3.f124840n = i - 1;
        bqVar3.f124827a |= 1024;
        fVar.copyOnWrite();
        C48391g gVar = (C48391g) fVar.instance;
        C48260bq bqVar4 = (C48260bq) boVar.build();
        bqVar4.getClass();
        gVar.f125082b = bqVar4;
        gVar.f125081a = 2;
        aVar.copyOnWrite();
        C48392h hVar = (C48392h) aVar.instance;
        C48391g gVar2 = (C48391g) fVar.build();
        gVar2.getClass();
        hVar.f125087b = gVar2;
        hVar.f125086a |= 1;
        return new C28353e(btVar, (C48392h) aVar.build());
    }

    /* renamed from: j */
    public final void mo22220j(ImageView imageView, C14292dv dvVar) {
        C63088z zVar;
        int a = C14291du.m30597a(dvVar.f43250p);
        if (a != 0 && a == 6) {
            mo22222l(imageView, dvVar);
            imageView.setBackgroundColor(C1878d.m5128a(this.f46051e, R.color.driving_screen_suggestion_loading_background_color));
            return;
        }
        int i = dvVar.f43235a;
        int a2 = C14289ds.m30596a(i);
        int i2 = a2 - 1;
        if (a2 == 0) {
            throw null;
        } else if (i2 == 0) {
            this.f46052f.mo22231n(imageView, i == 4 ? (String) dvVar.f43236b : BuildConfig.FLAVOR, new C15344r(this));
        } else if (i2 != 1) {
            mo22219i(imageView);
        } else {
            C15352z zVar2 = this.f46052f;
            if (i == 5) {
                zVar = (C63088z) dvVar.f43236b;
            } else {
                zVar = C63088z.f170246b;
            }
            zVar2.mo22230m(imageView, zVar, new C15344r(this));
        }
    }
}
