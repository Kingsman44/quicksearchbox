package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import androidx.p176n.p177a.C3795f;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114870dm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class ZeroStateMediaController {

    /* renamed from: a */
    public static final C59071e f317924a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ZeroStateMediaController");

    /* renamed from: A */
    private final TextView f317925A;

    /* renamed from: B */
    private final View f317926B;

    /* renamed from: C */
    private final View f317927C;

    /* renamed from: D */
    private final l f317928D;

    /* renamed from: E */
    private final C68214a f317929E;

    /* renamed from: F */
    private final C91097g f317930F;

    /* renamed from: G */
    private final C58833ax f317931G;

    /* renamed from: H */
    private final List f317932H;

    /* renamed from: b */
    public final Context f317933b;

    /* renamed from: c */
    public final View f317934c;

    /* renamed from: d */
    public final C22871g f317935d;

    /* renamed from: e */
    public final C22871g f317936e;

    /* renamed from: f */
    public final View f317937f;

    /* renamed from: g */
    public final C58833ax f317938g;

    /* renamed from: h */
    public final C108226ax f317939h;

    /* renamed from: i */
    final C114655bl f317940i = new C114655bl(this);

    /* renamed from: j */
    public C28293k f317941j;

    /* renamed from: k */
    C60870cx f317942k;

    /* renamed from: l */
    MediaController f317943l;

    /* renamed from: m */
    private final Activity f317944m;

    /* renamed from: n */
    private final ImageView f317945n;

    /* renamed from: o */
    private final ImageView f317946o;

    /* renamed from: p */
    private final C86124t f317947p;

    /* renamed from: q */
    private final C91189au f317948q;

    /* renamed from: r */
    private final boolean f317949r;

    /* renamed from: s */
    private final TextView f317950s;

    /* renamed from: t */
    private final TextView f317951t;

    /* renamed from: u */
    private final ImageButton f317952u;

    /* renamed from: v */
    private final ImageButton f317953v;

    /* renamed from: w */
    private final ImageButton f317954w;

    /* renamed from: x */
    private final View f317955x;

    /* renamed from: y */
    private final ImageView f317956y;

    /* renamed from: z */
    private final ImageView f317957z;

    /* compiled from: PG */
    class LifecycleObserver implements C2376g {
        public LifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            C59104x b = ZeroStateMediaController.f317924a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ZSMiCtl");
            ((C59052c) ((C59052c) b).mo56372aa(29302)).mo56386p("#Observer: onStart()");
            ZeroStateMediaController zeroStateMediaController = ZeroStateMediaController.this;
            zeroStateMediaController.f317943l = new C87594r(zeroStateMediaController.f317933b, zeroStateMediaController.f317935d, zeroStateMediaController.f317936e).mo81722a((String) null, false, true);
            zeroStateMediaController.mo101458d();
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            C59104x b = ZeroStateMediaController.f317924a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ZSMiCtl");
            ((C59052c) ((C59052c) b).mo56372aa(29303)).mo56386p("#Observer: onStop()");
            ZeroStateMediaController.this.mo101456b();
        }
    }

    public ZeroStateMediaController(boolean z, C58833ax axVar, C108226ax axVar2, C91097g gVar, Activity activity, Context context, C22871g gVar2, C22871g gVar3, C86124t tVar, C2391v vVar, C91189au auVar, l lVar, C68214a aVar, C58833ax axVar3) {
        ArrayList arrayList = new ArrayList();
        this.f317932H = arrayList;
        this.f317949r = z;
        this.f317938g = axVar;
        this.f317939h = axVar2;
        this.f317944m = activity;
        this.f317930F = gVar;
        this.f317933b = context;
        this.f317935d = gVar2;
        this.f317936e = gVar3;
        this.f317947p = tVar;
        this.f317948q = auVar;
        this.f317928D = lVar;
        this.f317929E = aVar;
        this.f317931G = axVar3;
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_state_docked_media_card, (ViewGroup) null);
        this.f317934c = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.f317950s = textView;
        textView.setSelected(true);
        this.f317951t = (TextView) inflate.findViewById(R.id.artist);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.album_art);
        this.f317945n = imageView;
        this.f317946o = (ImageView) inflate.findViewById(R.id.app_icon);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.play_or_pause);
        this.f317952u = imageButton;
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.prev);
        this.f317953v = imageButton2;
        ImageButton imageButton3 = (ImageButton) inflate.findViewById(R.id.next);
        this.f317954w = imageButton3;
        this.f317955x = inflate.findViewById(R.id.loading_icon);
        this.f317956y = (ImageView) inflate.findViewById(R.id.music_icon);
        this.f317957z = (ImageView) inflate.findViewById(R.id.add_icon);
        this.f317925A = (TextView) inflate.findViewById(R.id.music_instruction);
        View findViewById = inflate.findViewById(R.id.zero_state_docked_media_card_cover);
        this.f317937f = findViewById;
        this.f317926B = inflate.findViewById(R.id.zero_state_docked_media_card);
        this.f317927C = inflate.findViewById(R.id.media_summary_container);
        vVar.getLifecycle().mo5790b(new LifecycleObserver());
        C28292j jVar = new C28292j(61852);
        jVar.f76976d = true;
        inflate.getClass();
        C28295m.m52919e(inflate, jVar);
        C28292j jVar2 = new C28292j(61890);
        jVar2.mo33795i(5);
        findViewById.getClass();
        C28295m.m52919e(findViewById, jVar2);
        arrayList.add(C28293k.m52908e(jVar2, new C28293k[0]));
        C28292j jVar3 = new C28292j(61891);
        jVar3.mo33795i(5);
        imageView.getClass();
        C28295m.m52919e(imageView, jVar3);
        arrayList.add(C28293k.m52908e(jVar3, new C28293k[0]));
        C28292j jVar4 = new C28292j(61892);
        jVar4.mo33795i(5);
        imageButton2.getClass();
        C28295m.m52919e(imageButton2, jVar4);
        arrayList.add(C28293k.m52908e(jVar4, new C28293k[0]));
        C28292j jVar5 = new C28292j(61893);
        jVar5.mo33795i(5);
        imageButton3.getClass();
        C28295m.m52919e(imageButton3, jVar5);
        arrayList.add(C28293k.m52908e(jVar5, new C28293k[0]));
        C28292j jVar6 = new C28292j(61894);
        jVar6.mo33795i(5);
        imageButton.getClass();
        C28295m.m52919e(imageButton, jVar6);
        arrayList.add(C28293k.m52908e(jVar6, new C28293k[0]));
        this.f317941j = C28293k.m52907d(jVar, arrayList);
    }

    /* renamed from: i */
    static /* synthetic */ void m189986i(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            C59104x c = f317924a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ZSMiCtl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(29309)).mo56386p("Ambient media immersive activity intent expired.");
        }
    }

    /* renamed from: j */
    private final void m189987j() {
        C60870cx cxVar = this.f317942k;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f317942k = null;
        }
    }

    /* renamed from: k */
    private static boolean m189988k(long j, long j2) {
        return (j & j2) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo101455a() {
        C58976aa aaVar = C58975e.f156826a;
        MediaController mediaController = this.f317943l;
        if (mediaController != null) {
            MediaMetadata metadata = mediaController.getMetadata();
            if (metadata != null) {
                mo101462h(metadata);
            }
            MediaController mediaController2 = this.f317943l;
            mediaController2.getClass();
            PlaybackState playbackState = mediaController2.getPlaybackState();
            if (playbackState != null) {
                mo101459e(playbackState, playbackState.getActions());
            }
            MediaController mediaController3 = this.f317943l;
            mediaController3.getClass();
            mediaController3.registerCallback(this.f317940i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo101456b() {
        C58976aa aaVar = C58975e.f156826a;
        MediaController mediaController = this.f317943l;
        if (mediaController != null) {
            mediaController.unregisterCallback(this.f317940i);
        }
        m189987j();
    }

    /* renamed from: c */
    public final void mo101457c(Drawable drawable) {
        if (drawable != null) {
            this.f317945n.setImageDrawable(drawable);
            this.f317945n.setBackgroundColor(-16777216);
            this.f317945n.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return;
        }
        this.f317945n.setImageDrawable(this.f317933b.getDrawable(R.drawable.quantum_ic_music_note_black_18));
        this.f317945n.setBackgroundColor(this.f317933b.getResources().getColor(R.color.zero_state_dm_media_card_album_art_background_color));
        this.f317945n.setScaleType(ImageView.ScaleType.CENTER);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101458d() {
        /*
            r12 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.media.session.MediaController r0 = r12.f317943l
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0032
            com.google.android.apps.gsa.search.core.i.t r0 = r12.f317947p
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247198cd
            com.google.common.b.gu r0 = r0.mo79745c(r3)
            android.media.session.MediaController r3 = r12.f317943l
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r3.getPackageName()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x001f
            goto L_0x0032
        L_0x001f:
            android.media.session.MediaController r0 = r12.f317943l
            r0.getClass()
            android.media.MediaMetadata r0 = r0.getMetadata()
            if (r0 == 0) goto L_0x0032
            boolean r0 = r12.f317949r
            if (r2 == r0) goto L_0x0030
            r0 = 3
            goto L_0x0033
        L_0x0030:
            r0 = 2
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            int r0 = r0 + -1
            r3 = 2131173243(0x7f071f7b, float:1.7960924E38)
            r4 = 8
            r5 = 0
            if (r0 == 0) goto L_0x009a
            if (r0 == r2) goto L_0x006e
            android.view.View r0 = r12.f317937f
            r0.setVisibility(r4)
            android.view.View r0 = r12.f317926B
            r0.setVisibility(r5)
            android.view.View r0 = r12.f317927C
            r0.setVisibility(r5)
            android.content.Context r0 = r12.f317933b
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131173244(0x7f071f7c, float:1.7960926E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.view.View r1 = r12.f317934c
            r1.setPadding(r0, r5, r0, r5)
            android.widget.ImageButton r0 = r12.f317953v
            r0.setVisibility(r5)
            android.widget.ImageButton r0 = r12.f317954w
            r0.setVisibility(r5)
            r12.mo101455a()
            return
        L_0x006e:
            android.view.View r0 = r12.f317937f
            r0.setVisibility(r4)
            android.view.View r0 = r12.f317926B
            r0.setVisibility(r5)
            android.view.View r0 = r12.f317927C
            r0.setVisibility(r4)
            android.content.Context r0 = r12.f317933b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r3)
            android.view.View r1 = r12.f317934c
            r1.setPadding(r0, r5, r0, r5)
            android.widget.ImageButton r0 = r12.f317953v
            r0.setVisibility(r4)
            android.widget.ImageButton r0 = r12.f317954w
            r0.setVisibility(r4)
            r12.mo101455a()
            return
        L_0x009a:
            android.view.View r0 = r12.f317937f
            r0.setVisibility(r5)
            android.view.View r0 = r12.f317955x
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r12.f317956y
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r12.f317957z
            r0.setVisibility(r4)
            android.widget.TextView r0 = r12.f317925A
            r0.setVisibility(r4)
            android.view.View r0 = r12.f317926B
            r0.setVisibility(r4)
            android.content.Context r0 = r12.f317933b
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r3)
            android.view.View r3 = r12.f317934c
            r3.setPadding(r0, r5, r0, r5)
            android.view.View r0 = r12.f317934c
            android.content.Context r3 = r12.f317933b
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131235818(0x7f0813ea, float:1.808784E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            r0.setBackground(r3)
            com.google.android.apps.gsa.assistant.shared.n.l r4 = r12.f317928D
            dagger.a r0 = r12.f317929E
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r0
            android.accounts.Account r5 = r0.mo79668a()
            com.google.assistant.at.acv r0 = com.google.assistant.p3861at.acv.f128920X
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.at.acu r0 = (com.google.assistant.p3861at.acu) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.at.acv r3 = (com.google.assistant.p3861at.acv) r3
            int r6 = r3.f128945a
            r1 = r1 | r6
            r3.f128945a = r1
            r3.f128949e = r2
            com.google.protobuf.bv r0 = r0.build()
            r6 = r0
            com.google.assistant.at.acv r6 = (com.google.assistant.p3861at.acv) r6
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Class r0 = r12.getClass()
            java.lang.String r11 = r0.getSimpleName()
            r7 = 0
            r8 = 5
            com.google.common.util.concurrent.cx r0 = r4.j(r5, r6, r7, r8, r10, r11)
            com.google.android.libraries.gsa.k.g r1 = r12.f317935d
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bj r2 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bj
            r2.<init>(r12)
            java.lang.String r3 = "SettingsUiFuture"
            r1.mo28211k(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ZeroStateMediaController.mo101458d():void");
    }

    /* renamed from: e */
    public final void mo101459e(PlaybackState playbackState, long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f317943l != null) {
            if (m189988k(j, 16)) {
                this.f317953v.setOnClickListener(new C89943l(new C114645bb(this)));
                this.f317953v.setAlpha(1.0f);
            } else {
                this.f317953v.setOnClickListener((View.OnClickListener) null);
                this.f317953v.setAlpha(0.25f);
            }
            if (m189988k(j, 32)) {
                this.f317954w.setOnClickListener(new C89943l(new C114646bc(this)));
                this.f317954w.setAlpha(1.0f);
            } else {
                this.f317954w.setOnClickListener((View.OnClickListener) null);
                this.f317954w.setAlpha(0.25f);
            }
            if (playbackState.getState() == 3 || playbackState.getState() == 6) {
                if (m189988k(j, 2)) {
                    this.f317952u.setAlpha(1.0f);
                    if (playbackState.getState() == 3) {
                        this.f317952u.setImageResource(R.drawable.quantum_ic_pause_white_36);
                        this.f317952u.setOnClickListener(new C89943l(new C114650bg(this)));
                    }
                } else if (m189988k(j, 1)) {
                    this.f317952u.setAlpha(1.0f);
                    if (playbackState.getState() == 3) {
                        this.f317952u.setImageResource(R.drawable.quantum_ic_stop_white_36);
                        this.f317952u.setOnClickListener(new C89943l(new C114651bh(this)));
                    }
                } else {
                    this.f317952u.setAlpha(0.25f);
                    this.f317952u.setOnClickListener((View.OnClickListener) null);
                }
                m189987j();
            } else if (playbackState.getState() == 2 || playbackState.getState() == 1) {
                if (m189988k(j, 4)) {
                    this.f317952u.setAlpha(1.0f);
                    if (playbackState.getState() == 2 || playbackState.getState() == 1) {
                        this.f317952u.setImageResource(R.drawable.quantum_ic_play_arrow_white_36);
                        this.f317952u.setOnClickListener(new C114648be(this));
                    }
                } else {
                    this.f317952u.setAlpha(0.25f);
                    this.f317952u.setOnClickListener((View.OnClickListener) null);
                }
                if (this.f317942k == null) {
                    this.f317942k = this.f317935d.mo28208h("Dismiss activity after pause", (long) ((int) this.f317947p.mo79743a(C90014bt.f247133bR)), new C114647bd(this));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo101460f(Bitmap bitmap) {
        if (bitmap != null) {
            new C3795f(bitmap).mo8024b(new C114644ba(this));
        }
    }

    /* renamed from: g */
    public final void mo101461g(boolean z) {
        int i = 8;
        this.f317955x.setVisibility(8);
        this.f317956y.setVisibility(0);
        this.f317925A.setText(z ? R.string.play_music_text : R.string.choose_provider_text);
        this.f317925A.setVisibility(0);
        ImageView imageView = this.f317957z;
        if (true != z) {
            i = 0;
        }
        imageView.setVisibility(i);
        if (z) {
            this.f317937f.setOnClickListener(new C89943l(new C114652bi(this)));
            return;
        }
        View view = this.f317937f;
        Activity activity = this.f317944m;
        C58833ax axVar = this.f317931G;
        C91097g gVar = this.f317930F;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "music";
        view.setOnClickListener(new C89943l(new C114870dm(activity, axVar, new C114649bf(gVar, c.mo24020b().mo24031a()), this.f317930F)));
    }

    /* renamed from: h */
    public final void mo101462h(MediaMetadata mediaMetadata) {
        Drawable drawable;
        C58976aa aaVar = C58975e.f156826a;
        try {
            if (mediaMetadata.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl")) {
                drawable = this.f317933b.getResources().getDrawable(R.drawable.product_logo_podcasts_round_color_24);
            } else {
                PackageManager packageManager = this.f317933b.getPackageManager();
                MediaController mediaController = this.f317943l;
                mediaController.getClass();
                drawable = packageManager.getApplicationIcon(mediaController.getPackageName());
            }
            this.f317946o.setImageDrawable(drawable);
            this.f317950s.setText(mediaMetadata.getString("android.media.metadata.TITLE"));
            this.f317951t.setText(mediaMetadata.getString("android.media.metadata.ARTIST"));
            Bitmap bitmap = mediaMetadata.getBitmap("android.media.metadata.ALBUM_ART");
            if (bitmap == null) {
                bitmap = mediaMetadata.getBitmap("android.media.metadata.ART");
            }
            if (bitmap == null) {
                bitmap = mediaMetadata.getBitmap("android.media.metadata.DISPLAY_ICON");
            }
            String string = mediaMetadata.getString("android.media.metadata.ALBUM_ART_URI");
            if (string == null) {
                string = mediaMetadata.getString("android.media.metadata.ART_URI");
            }
            if (string == null) {
                string = mediaMetadata.getString("android.media.metadata.DISPLAY_ICON_URI");
            }
            if (bitmap != null) {
                mo101460f(bitmap);
                mo101457c(new BitmapDrawable(bitmap));
            } else if (string != null) {
                this.f317935d.mo28211k(this.f317948q.mo85417d(Uri.parse(string)), "Load album art", new C114654bk(this, drawable));
            } else {
                mo101460f(C90772bp.m148294b(drawable));
                mo101457c((Drawable) null);
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f317933b, "com.google.android.apps.gsa.staticplugins.opa.experience.OpaMActivity"));
            this.f317945n.setOnClickListener(new C114642az(PendingIntent.getActivity(this.f317933b, 0, intent, 335544320)));
        } catch (PackageManager.NameNotFoundException e) {
            C59104x c = f317924a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ZSMiCtl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(29314)).mo56386p("Media app icon not found");
        }
    }
}
