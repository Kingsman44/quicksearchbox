package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.p033v7.app.C0395p;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2097l;
import androidx.core.p098j.C2098m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6883x.C87280a;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7148ui.SwipeDismissableFrameLayout;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107071k;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110016c;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110349bh;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110401a;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110425l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.y */
/* compiled from: PG */
public final class C110161y implements C2010ad {

    /* renamed from: a */
    public static final C59071e f306932a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.h.y");

    /* renamed from: A */
    public C60870cx f306933A;

    /* renamed from: B */
    C60870cx f306934B;

    /* renamed from: C */
    public C60870cx f306935C;

    /* renamed from: D */
    public MediaController f306936D;

    /* renamed from: E */
    ViewGroup f306937E;

    /* renamed from: F */
    public final OpaAmbientUiStatus f306938F;

    /* renamed from: G */
    public final C110016c f306939G;

    /* renamed from: H */
    final View f306940H;

    /* renamed from: I */
    private final C107071k f306941I;

    /* renamed from: J */
    private Drawable f306942J;

    /* renamed from: K */
    private final Drawable f306943K;

    /* renamed from: L */
    private final C91189au f306944L;

    /* renamed from: M */
    private final C68214a f306945M;

    /* renamed from: N */
    private final C110401a f306946N;

    /* renamed from: O */
    private final C110349bh f306947O;

    /* renamed from: P */
    private PendingIntent f306948P;

    /* renamed from: Q */
    private final C68214a f306949Q;

    /* renamed from: R */
    private final C68214a f306950R;

    /* renamed from: S */
    private final GestureDetector.SimpleOnGestureListener f306951S;

    /* renamed from: b */
    public final C0395p f306952b;

    /* renamed from: c */
    public final Context f306953c;

    /* renamed from: d */
    public final View f306954d;

    /* renamed from: e */
    final ImageView f306955e;

    /* renamed from: f */
    public final ImageView f306956f;

    /* renamed from: g */
    public final TextView f306957g;

    /* renamed from: h */
    public final C22871g f306958h;

    /* renamed from: i */
    public final C22871g f306959i;

    /* renamed from: j */
    public final C58833ax f306960j;

    /* renamed from: k */
    public final C86124t f306961k;

    /* renamed from: l */
    final GestureDetector f306962l;

    /* renamed from: m */
    public final boolean f306963m;

    /* renamed from: n */
    C109024k f306964n;

    /* renamed from: o */
    public final ImageView f306965o;

    /* renamed from: p */
    final TextView f306966p;

    /* renamed from: q */
    final TextView f306967q;

    /* renamed from: r */
    final ImageButton f306968r;

    /* renamed from: s */
    final ImageButton f306969s;

    /* renamed from: t */
    final ImageButton f306970t;

    /* renamed from: u */
    final SeekBar f306971u;

    /* renamed from: v */
    final TextView f306972v;

    /* renamed from: w */
    final TextView f306973w;

    /* renamed from: x */
    final TextView f306974x;

    /* renamed from: y */
    public final C110160x f306975y;

    /* renamed from: z */
    final SwipeDismissableFrameLayout f306976z;

    /* JADX WARNING: type inference failed for: r8v42, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110161y(android.support.p033v7.app.C0395p r12, android.content.Context r13, com.google.android.libraries.gsa.p1876k.C22871g r14, com.google.android.libraries.gsa.p1876k.C22871g r15, com.google.common.base.C58833ax r16, com.google.android.apps.gsa.search.core.p6805i.C86124t r17, com.google.android.apps.gsa.shared.p7195y.C91189au r18, dagger.C68214a r19, com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110401a r20, boolean r21, com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110349bh r22, dagger.C68214a r23, com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus r24, com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110016c r25, dagger.C68214a r26, com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107071k r27) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r21
            r4 = r22
            r5 = r24
            r11.<init>()
            com.google.android.apps.gsa.staticplugins.opa.samson.h.r r6 = new com.google.android.apps.gsa.staticplugins.opa.samson.h.r
            r6.<init>(r11)
            r0.f306951S = r6
            r0.f306947O = r4
            r7 = r23
            r0.f306949Q = r7
            r0.f306963m = r3
            r0.f306938F = r5
            r7 = r25
            r0.f306939G = r7
            r0.f306952b = r1
            r0.f306953c = r2
            r7 = r14
            r0.f306958h = r7
            r7 = r15
            r0.f306959i = r7
            r7 = r16
            r0.f306960j = r7
            r7 = r17
            r0.f306961k = r7
            r7 = r18
            r0.f306944L = r7
            r7 = r19
            r0.f306945M = r7
            r7 = r26
            r0.f306950R = r7
            r7 = r27
            r0.f306941I = r7
            r7 = r20
            r0.f306946N = r7
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r13)
            r8 = 2131625910(0x7f0e07b6, float:1.8879041E38)
            r9 = 0
            android.view.View r7 = r7.inflate(r8, r9)
            r0.f306954d = r7
            r8 = 2131434140(0x7f0b1a9c, float:1.8490086E38)
            android.view.View r8 = r7.findViewById(r8)
            com.google.android.apps.gsa.shared.ui.SwipeDismissableFrameLayout r8 = (com.google.android.apps.gsa.shared.p7148ui.SwipeDismissableFrameLayout) r8
            r0.f306976z = r8
            r8.f253392g = r3
            com.google.android.apps.gsa.staticplugins.opa.samson.h.n r10 = new com.google.android.apps.gsa.staticplugins.opa.samson.h.n
            r10.<init>(r11)
            r8.f253387b = r10
            r8 = 2131436665(0x7f0b2479, float:1.8495207E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f306940H = r8
            r8 = 2131436600(0x7f0b2438, float:1.8495075E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0.f306966p = r8
            r10 = 1
            r8.setSelected(r10)
            r10 = 83121(0x144b1, float:1.16477E-40)
            r11.m183453p(r8, r10)
            r8 = 2131427918(0x7f0b024e, float:1.8477466E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0.f306967q = r8
            r10 = 83122(0x144b2, float:1.16479E-40)
            r11.m183453p(r8, r10)
            r8 = 2131427674(0x7f0b015a, float:1.847697E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f306955e = r8
            r10 = 83123(0x144b3, float:1.1648E-40)
            r11.m183453p(r8, r10)
            r8 = 2131427864(0x7f0b0218, float:1.8477356E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f306956f = r8
            if (r3 == 0) goto L_0x00c0
            r8 = 2131427889(0x7f0b0231, float:1.8477407E38)
            android.view.View r8 = r7.findViewById(r8)
            r9 = r8
            android.widget.TextView r9 = (android.widget.TextView) r9
        L_0x00c0:
            r0.f306957g = r9
            r8 = 2131434572(0x7f0b1c4c, float:1.8490962E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageButton r8 = (android.widget.ImageButton) r8
            r0.f306968r = r8
            r9 = 83117(0x144ad, float:1.16472E-40)
            r11.m183453p(r8, r9)
            r8 = 2131434948(0x7f0b1dc4, float:1.8491724E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageButton r8 = (android.widget.ImageButton) r8
            r0.f306969s = r8
            r9 = 83119(0x144af, float:1.16475E-40)
            r11.m183453p(r8, r9)
            r8 = 2131433542(0x7f0b1846, float:1.8488873E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageButton r8 = (android.widget.ImageButton) r8
            r0.f306970t = r8
            r9 = 83118(0x144ae, float:1.16473E-40)
            r11.m183453p(r8, r9)
            r8 = 2131435689(0x7f0b20a9, float:1.8493227E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.SeekBar r8 = (android.widget.SeekBar) r8
            r0.f306971u = r8
            com.google.android.apps.gsa.staticplugins.opa.samson.h.s r9 = new com.google.android.apps.gsa.staticplugins.opa.samson.h.s
            r9.<init>(r11)
            r8.setOnSeekBarChangeListener(r9)
            android.graphics.drawable.Drawable r8 = r8.getThumb()
            r0.f306943K = r8
            r8 = 2131430399(0x7f0b0bff, float:1.8482498E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0.f306972v = r8
            r8 = 2131436691(0x7f0b2493, float:1.849526E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0.f306973w = r8
            r8 = 2131429255(0x7f0b0787, float:1.8480178E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0.f306974x = r8
            if (r3 != 0) goto L_0x0137
            r3 = 8
            r8.setVisibility(r3)
            goto L_0x0163
        L_0x0137:
            r3 = 0
            r8.setVisibility(r3)
            androidx.lifecycle.bp r3 = new androidx.lifecycle.bp
            r3.<init>(r12)
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.experience.k> r8 = com.google.android.apps.gsa.staticplugins.opa.experience.C109024k.class
            androidx.lifecycle.bf r3 = r3.mo5770a(r8)
            com.google.android.apps.gsa.staticplugins.opa.experience.k r3 = (com.google.android.apps.gsa.staticplugins.opa.experience.C109024k) r3
            r0.f306964n = r3
            r3.getClass()
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.BatteryStatusController r3 = r4.mo98582a(r3)
            r3.mo98563b(r12)
            com.google.android.apps.gsa.staticplugins.opa.experience.k r3 = r0.f306964n
            r3.getClass()
            androidx.lifecycle.ag r3 = r3.f303168d
            com.google.android.apps.gsa.staticplugins.opa.samson.h.o r4 = new com.google.android.apps.gsa.staticplugins.opa.samson.h.o
            r4.<init>(r11)
            r3.mo5704e(r12, r4)
        L_0x0163:
            com.google.android.apps.gsa.staticplugins.opa.samson.h.x r3 = new com.google.android.apps.gsa.staticplugins.opa.samson.h.x
            r3.<init>(r11)
            r0.f306975y = r3
            r3 = 2131434082(0x7f0b1a62, float:1.8489968E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f306965o = r3
            r4 = 83120(0x144b0, float:1.16476E-40)
            r11.m183453p(r3, r4)
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r13, r6)
            r0.f306962l = r3
            com.google.android.apps.gsa.staticplugins.opa.samson.h.t r2 = new com.google.android.apps.gsa.staticplugins.opa.samson.h.t
            r2.<init>(r11)
            r7.setOnTouchListener(r2)
            r2 = 2131433151(0x7f0b16bf, float:1.848808E38)
            android.view.View r2 = r7.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f306937E = r2
            androidx.core.p098j.C2043bi.m5555ai(r7, r11)
            r5.mo98392e(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.p8433h.C110161y.<init>(android.support.v7.app.p, android.content.Context, com.google.android.libraries.gsa.k.g, com.google.android.libraries.gsa.k.g, com.google.common.base.ax, com.google.android.apps.gsa.search.core.i.t, com.google.android.apps.gsa.shared.y.au, dagger.a, com.google.android.apps.gsa.staticplugins.opa.samson.shared.a, boolean, com.google.android.apps.gsa.staticplugins.opa.samson.photos.bh, dagger.a, com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus, com.google.android.apps.gsa.staticplugins.opa.samson.a.b.c, dagger.a, com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.k):void");
    }

    /* renamed from: b */
    static String m183449b(long j) {
        StringBuilder sb = new StringBuilder();
        if (j >= TimeUnit.HOURS.toMillis(1)) {
            long millis = j / TimeUnit.HOURS.toMillis(1);
            j -= TimeUnit.HOURS.toMillis(1) * millis;
            if (millis > 0) {
                m183452o(sb, millis);
            }
        }
        long millis2 = j / TimeUnit.MINUTES.toMillis(1);
        long millis3 = TimeUnit.MINUTES.toMillis(1);
        m183452o(sb, millis2);
        m183452o(sb, (j - (millis2 * millis3)) / TimeUnit.SECONDS.toMillis(1));
        return sb.toString();
    }

    /* renamed from: g */
    public static void m183450g(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            C59104x c = f306932a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaCtl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25780)).mo56386p("Media session activity intent expired.");
        }
    }

    /* renamed from: n */
    public static boolean m183451n(long j, long j2) {
        return (j & j2) != 0;
    }

    /* renamed from: o */
    private static void m183452o(StringBuilder sb, long j) {
        Object obj;
        if (sb.length() != 0) {
            sb.append(":");
        }
        if (sb.length() == 0) {
            obj = Long.valueOf(j);
        } else if (j < 10) {
            obj = "0" + j;
        } else {
            obj = String.valueOf(j);
        }
        sb.append(obj);
    }

    /* renamed from: p */
    private final void m183453p(View view, int i) {
        if (this.f306963m) {
            C28292j jVar = new C28292j(i);
            jVar.mo33795i(5);
            view.getClass();
            C28295m.m52919e(view, jVar);
        }
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C2098m q = cpVar.f5994b.mo5234q();
        if (q != null) {
            Resources resources = this.f306953c.getResources();
            this.f306937E.setPadding(C2097l.m5778b(q.f6013a) + resources.getDimensionPixelOffset(R.dimen.content_left_padding), C2097l.m5780d(q.f6013a) + resources.getDimensionPixelOffset(R.dimen.content_top_padding), C2097l.m5779c(q.f6013a) + resources.getDimensionPixelOffset(R.dimen.content_right_padding), C2097l.m5777a(q.f6013a));
        }
        return cpVar.f5994b.mo5235r();
    }

    /* renamed from: c */
    public final void mo98430c(int i) {
        if (!this.f306963m) {
            this.f306952b.finish();
            return;
        }
        if (i == 3) {
            this.f306938F.f306843a = true;
            C58976aa aaVar = C58975e.f156826a;
            PowerManager.WakeLock newWakeLock = ((PowerManager) this.f306953c.getSystemService("power")).newWakeLock(268435482, "agsa:opa-amb-media-ctrl");
            newWakeLock.acquire(200);
            try {
                newWakeLock.release();
            } catch (RuntimeException unused) {
            }
        } else if (i == 2) {
            if (((C110425l) this.f306950R.mo27525b()).mo98664b()) {
                i = 2;
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                return;
            }
        }
        C59104x b = f306932a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaCtl");
        ((C59052c) ((C59052c) b).mo56372aa(25772)).mo56387q("exit with reason: %d", i);
        if (this.f306952b.getCallingActivity() != null) {
            this.f306952b.setResult(-1, new Intent().putExtra("MEDIA_EXTRA_EXIT_REASON", i));
            this.f306952b.finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("launch_ambient_mode_from_assist", true);
        bundle.putBoolean("launch_ambient_ignore_immersives", true);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("MEDIA_EXTRA_EXIT_REASON", i);
        bundle.putBundle("ambient_screen_extras", bundle2);
        ((C87573b) this.f306949Q.mo27525b()).mo81706d(bundle);
        this.f306958h.mo28213m("finish activity", 500, new C110146j(this));
    }

    /* renamed from: d */
    public final void mo98431d(int i) {
        this.f306958h.mo28213m("finish activity", 300, new C110144h(this, i));
    }

    /* renamed from: e */
    public final void mo98432e(int i) {
        String x = this.f306961k.mo79758x(C90014bt.f247195ca);
        String x2 = this.f306961k.mo79758x(C90014bt.f247141bZ);
        if (!TextUtils.isEmpty(x) && !TextUtils.isEmpty(x2)) {
            try {
                this.f306953c.getContentResolver().call(Uri.parse(x), x2, (String) null, (Bundle) null);
            } catch (Throwable th) {
                C59104x c = f306932a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MediaCtl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25776)).mo56386p("exception while calling provider");
            }
        }
        mo98431d(i);
    }

    /* renamed from: f */
    public final void mo98433f() {
        C60870cx cxVar = this.f306934B;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f306934B = null;
        }
    }

    /* renamed from: h */
    public final void mo98434h(Drawable drawable) {
        this.f306942J = drawable;
        if (drawable != null) {
            this.f306955e.setImageDrawable(drawable);
            this.f306955e.setBackgroundColor(-16777216);
            this.f306955e.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            this.f306955e.setImageDrawable(this.f306953c.getDrawable(R.drawable.ic_music_note_black));
            this.f306955e.setBackgroundColor(this.f306953c.getResources().getColor(R.color.album_art_background_color));
            this.f306955e.setScaleType(ImageView.ScaleType.CENTER);
        }
        if (this.f306963m) {
            Drawable drawable2 = this.f306942J;
            if (!this.f306961k.mo79746e(C90014bt.f247108at) || drawable2 == null) {
                this.f306937E.setBackgroundColor(this.f306953c.getColor(17170444));
                return;
            }
            C110401a aVar = this.f306946N;
            Bitmap b = C90772bp.m148294b(drawable2);
            b.getClass();
            RenderScript create = RenderScript.create(aVar.f307688a);
            Bitmap copy = b.copy(Bitmap.Config.ARGB_8888, true);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(copy, Math.round(((float) copy.getWidth()) * 0.3f), Math.round(((float) copy.getHeight()) * 0.3f), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setInput(createFromBitmap);
            create2.setRadius(24.0f);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            createFromBitmap.destroy();
            createFromBitmap2.destroy();
            create2.destroy();
            C110401a aVar2 = this.f306946N;
            aVar2.f307689b.setColorFilter(new LightingColorFilter(C1878d.m5128a(this.f306953c, R.color.album_art_foreground_scrim), 0));
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, aVar2.f307689b);
            this.f306937E.setBackground(new BitmapDrawable(this.f306953c.getResources(), createBitmap2));
        }
    }

    /* renamed from: i */
    public final void mo98435i() {
        PendingIntent pendingIntent = this.f306948P;
        if (pendingIntent != null) {
            if (((KeyguardManager) this.f306953c.getSystemService("keyguard")).isKeyguardLocked()) {
                this.f306941I.mo95770e(new C110159w(pendingIntent));
            } else {
                m183450g(pendingIntent);
            }
        }
    }

    /* renamed from: j */
    public final void mo98436j(PlaybackState playbackState, long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f306936D == null) {
            C59104x d = f306932a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaCtl");
            ((C59052c) ((C59052c) d).mo56372aa(25782)).mo56386p("#updateActionButtons: null controller");
            return;
        }
        if (m183451n(j, 16)) {
            this.f306969s.setOnClickListener(new C89943l(new C110140d(this)));
            this.f306969s.setAlpha(1.0f);
        } else {
            this.f306969s.setOnClickListener((View.OnClickListener) null);
            this.f306969s.setAlpha(0.25f);
        }
        if (m183451n(j, 32)) {
            this.f306970t.setOnClickListener(new C89943l(new C110141e(this)));
            this.f306970t.setAlpha(1.0f);
        } else {
            this.f306970t.setOnClickListener((View.OnClickListener) null);
            this.f306970t.setAlpha(0.25f);
        }
        if (playbackState.getState() == 3) {
            if (m183451n(j, 2)) {
                this.f306968r.setAlpha(1.0f);
                if (playbackState.getState() == 3) {
                    this.f306968r.setImageResource(R.drawable.ic_pause_white_36dp);
                    this.f306968r.setOnClickListener(new C89943l(new C110147k(this)));
                }
            } else if (m183451n(j, 1)) {
                this.f306968r.setAlpha(1.0f);
                if (playbackState.getState() == 3) {
                    this.f306968r.setImageResource(R.drawable.ic_stop_white_36dp);
                    this.f306968r.setOnClickListener(new C89943l(new C110148l(this)));
                }
            } else {
                this.f306968r.setAlpha(0.25f);
                this.f306968r.setOnClickListener((View.OnClickListener) null);
            }
            mo98433f();
        } else if (playbackState.getState() == 2 || playbackState.getState() == 1) {
            if (m183451n(j, 4)) {
                this.f306968r.setAlpha(1.0f);
                if (playbackState.getState() == 2 || playbackState.getState() == 1) {
                    this.f306968r.setImageResource(R.drawable.ic_play_arrow_white_36dp);
                    this.f306968r.setOnClickListener(new C89943l(new C110149m(this)));
                }
            } else {
                this.f306968r.setAlpha(0.25f);
                this.f306968r.setOnClickListener((View.OnClickListener) null);
            }
            if (this.f306934B == null) {
                this.f306934B = this.f306958h.mo28208h("Dismiss activity after pause", (long) ((int) this.f306961k.mo79743a(C90014bt.f247133bR)), new C110142f(this));
            }
        }
    }

    /* renamed from: k */
    public final void mo98437k(MediaMetadata mediaMetadata) {
        C58976aa aaVar = C58975e.f156826a;
        String string = mediaMetadata.getString("android.media.metadata.TITLE");
        String string2 = mediaMetadata.getString("android.media.metadata.ARTIST");
        this.f306966p.setText(string);
        this.f306966p.setContentDescription(this.f306953c.getResources().getString(R.string.media_title_a11y, new Object[]{string}));
        this.f306967q.setText(string2);
        this.f306967q.setContentDescription(this.f306953c.getResources().getString(R.string.media_artist_a11y, new Object[]{string2}));
        Bitmap bitmap = mediaMetadata.getBitmap("android.media.metadata.ALBUM_ART");
        if (bitmap == null) {
            bitmap = mediaMetadata.getBitmap("android.media.metadata.ART");
        }
        if (bitmap == null) {
            bitmap = mediaMetadata.getBitmap("android.media.metadata.DISPLAY_ICON");
        }
        String string3 = mediaMetadata.getString("android.media.metadata.ALBUM_ART_URI");
        if (string3 == null) {
            string3 = mediaMetadata.getString("android.media.metadata.ART_URI");
        }
        if (string3 == null) {
            string3 = mediaMetadata.getString("android.media.metadata.DISPLAY_ICON_URI");
        }
        if (bitmap != null) {
            mo98434h(new BitmapDrawable(bitmap));
            this.f306955e.setContentDescription(this.f306953c.getResources().getString(R.string.album_art_a11y, new Object[]{mediaMetadata.getString("android.media.metadata.ALBUM")}));
        } else if (string3 != null) {
            this.f306958h.mo28211k(this.f306944L.mo85417d(Uri.parse(string3)), "Load album art", new C110158v(this));
        } else {
            mo98434h((Drawable) null);
        }
        MediaController mediaController = this.f306936D;
        mediaController.getClass();
        PendingIntent sessionActivity = mediaController.getSessionActivity();
        if (sessionActivity == null) {
            C59071e eVar = f306932a;
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaCtl");
            ((C59052c) ((C59052c) d).mo56372aa(25769)).mo56386p("Failed t o a by sa. Fallback to i w a p n.");
            MediaController mediaController2 = this.f306936D;
            mediaController2.getClass();
            String packageName = mediaController2.getPackageName();
            if (packageName != null) {
                C87280a aVar = (C87280a) this.f306945M.mo27525b();
                boolean equals = "com.google.android.apps.books".equals(packageName);
                Intent launchIntentForPackage = this.f306953c.getPackageManager().getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage != null) {
                    if (equals) {
                        ((C87280a) this.f306945M.mo27525b()).mo80926a(launchIntentForPackage);
                    }
                    launchIntentForPackage.setFlags(536870912);
                    sessionActivity = PendingIntent.getActivity(this.f306953c, 0, launchIntentForPackage, 335544320);
                } else {
                    C59104x d2 = eVar.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "MediaCtl");
                    ((C59052c) ((C59052c) d2).mo56372aa(25770)).mo56386p("Failed to g i from p");
                }
            }
        }
        this.f306948P = sessionActivity;
        this.f306955e.setOnClickListener(new C89943l(new C110152p(this)));
        if (this.f306963m) {
            this.f306966p.setOnClickListener(new C89943l(new C110153q(this)));
            this.f306967q.setOnClickListener(new C89943l(new C110139c(this)));
        }
        this.f306971u.setMax((int) mediaMetadata.getLong("android.media.metadata.DURATION"));
        this.f306973w.setText(m183449b(mediaMetadata.getLong("android.media.metadata.DURATION")));
    }

    /* renamed from: l */
    public final void mo98438l() {
        this.f306933A = null;
        MediaController mediaController = this.f306936D;
        if (mediaController == null) {
            C59104x d = f306932a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaCtl");
            ((C59052c) ((C59052c) d).mo56372aa(25786)).mo56386p("updateSeekbar(): null controller");
            return;
        }
        PlaybackState playbackState = mediaController.getPlaybackState();
        if (playbackState == null) {
            C59104x d2 = f306932a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaCtl");
            ((C59052c) ((C59052c) d2).mo56372aa(25785)).mo56386p("updateSeekbar(): null playstate");
            return;
        }
        long position = playbackState.getPosition();
        this.f306972v.setText(m183449b(position));
        this.f306971u.setProgress((int) position);
        this.f306933A = this.f306958h.mo28208h("Update seek bar", 1000, new C110143g(this));
    }

    /* renamed from: m */
    public final void mo98439m(long j) {
        this.f306971u.setEnabled(m183451n(j, 256));
        this.f306971u.setThumb(m183451n(j, 256) ? this.f306943K : null);
    }
}
