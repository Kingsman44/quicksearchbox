package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.Activity;
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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.googlequicksearchbox.R;
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
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class AmbientMediaSectionController implements C114757k {

    /* renamed from: a */
    public static final C59071e f319062a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.AmbientMediaSectionController");

    /* renamed from: b */
    public final ImageView f319063b;

    /* renamed from: c */
    public final Context f319064c;

    /* renamed from: d */
    public final C22871g f319065d;

    /* renamed from: e */
    public final C22871g f319066e;

    /* renamed from: f */
    public final View f319067f;

    /* renamed from: g */
    public final C91097g f319068g;

    /* renamed from: h */
    public final List f319069h = new ArrayList();

    /* renamed from: i */
    MediaController f319070i;

    /* renamed from: j */
    public C28293k f319071j;

    /* renamed from: k */
    final C115067l f319072k;

    /* renamed from: l */
    private final ImageView f319073l;

    /* renamed from: m */
    private final ImageView f319074m;

    /* renamed from: n */
    private final C68214a f319075n;

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
        public final void mo3522gX(C2391v vVar) {
            C59104x b = AmbientMediaSectionController.f319062a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AmbientMediaSC");
            ((C59052c) ((C59052c) b).mo56372aa(29447)).mo56386p("#Observer: onPause()");
            AmbientMediaSectionController ambientMediaSectionController = AmbientMediaSectionController.this;
            MediaController mediaController = ambientMediaSectionController.f319070i;
            if (mediaController != null) {
                mediaController.unregisterCallback(ambientMediaSectionController.f319072k);
            }
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            C59104x b = AmbientMediaSectionController.f319062a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AmbientMediaSC");
            ((C59052c) ((C59052c) b).mo56372aa(29448)).mo56386p("#Observer: onStart()");
            AmbientMediaSectionController ambientMediaSectionController = AmbientMediaSectionController.this;
            ambientMediaSectionController.f319070i = new C87594r(ambientMediaSectionController.f319064c, ambientMediaSectionController.f319065d, ambientMediaSectionController.f319066e).mo81722a((String) null, false, true);
            if (ambientMediaSectionController.mo101765m()) {
                MediaController mediaController = ambientMediaSectionController.f319070i;
                mediaController.getClass();
                MediaMetadata metadata = mediaController.getMetadata();
                ambientMediaSectionController.f319067f.setVisibility(0);
                ambientMediaSectionController.f319067f.findViewById(R.id.amb_media_recommendation).setVisibility(8);
                ambientMediaSectionController.f319067f.findViewById(R.id.amb_media_playing).setVisibility(0);
                metadata.getClass();
                ambientMediaSectionController.mo101764l(metadata);
                MediaController mediaController2 = ambientMediaSectionController.f319070i;
                mediaController2.getClass();
                PlaybackState playbackState = mediaController2.getPlaybackState();
                if (playbackState != null) {
                    ambientMediaSectionController.mo101763k(playbackState, playbackState.getActions());
                }
                MediaController mediaController3 = ambientMediaSectionController.f319070i;
                mediaController3.getClass();
                mediaController3.registerCallback(ambientMediaSectionController.f319072k);
                C28292j jVar = new C28292j(75847);
                jVar.mo33795i(5);
                View view = ambientMediaSectionController.f319067f;
                view.getClass();
                C28295m.m52919e(view, jVar);
                ambientMediaSectionController.f319071j = C28293k.m52907d(jVar, ambientMediaSectionController.f319069h);
                C28292j jVar2 = new C28292j(76001);
                jVar2.mo33795i(5);
                ImageView imageView = ambientMediaSectionController.f319063b;
                imageView.getClass();
                C28295m.m52919e(imageView, jVar2);
                ambientMediaSectionController.f319069h.add(C28293k.m52908e(jVar2, new C28293k[0]));
                ambientMediaSectionController.f319071j = C28293k.m52907d(jVar, ambientMediaSectionController.f319069h);
                return;
            }
            ambientMediaSectionController.mo101762j();
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    public AmbientMediaSectionController(Context context, Activity activity, C68214a aVar, C22871g gVar, C22871g gVar2, C2391v vVar, C91097g gVar3) {
        this.f319064c = context;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.ambient_media_view, (ViewGroup) null);
        this.f319067f = inflate;
        this.f319075n = aVar;
        this.f319065d = gVar;
        this.f319066e = gVar2;
        this.f319072k = new C115067l(this);
        this.f319068g = gVar3;
        this.f319073l = (ImageView) inflate.findViewById(R.id.amb_media_playing_image);
        this.f319074m = (ImageView) inflate.findViewById(R.id.play_or_pause);
        this.f319063b = (ImageView) inflate.findViewById(R.id.play_or_pause_circle);
        vVar.getLifecycle().mo5790b(new LifecycleObserver());
    }

    /* renamed from: n */
    private static boolean m190575n(long j, long j2) {
        return (j & j2) != 0;
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f319067f;
    }

    /* renamed from: b */
    public final /* synthetic */ C114750d mo101578b(int i) {
        return null;
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        return this.f319071j;
    }

    /* renamed from: d */
    public final void mo101580d() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo101581e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101582f() {
    }

    /* renamed from: g */
    public final void mo101583g(C58833ax axVar) {
    }

    /* renamed from: h */
    public final void mo101761h(Drawable drawable) {
        if (drawable != null) {
            this.f319073l.setImageDrawable(drawable);
            this.f319073l.setBackgroundColor(-16777216);
            this.f319073l.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return;
        }
        this.f319073l.setImageDrawable(this.f319064c.getDrawable(R.drawable.quantum_ic_music_note_black_18));
        this.f319073l.setBackgroundColor(this.f319064c.getResources().getColor(R.color.zero_state_dm_media_card_album_art_background_color));
        this.f319073l.setScaleType(ImageView.ScaleType.CENTER);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo101584i() {
    }

    /* renamed from: j */
    public final void mo101762j() {
        this.f319067f.findViewById(R.id.amb_media_recommendation).setVisibility(0);
        this.f319067f.findViewById(R.id.amb_media_playing).setVisibility(8);
        this.f319067f.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo101763k(PlaybackState playbackState, long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319070i == null) {
            return;
        }
        if (playbackState.getState() == 3 || playbackState.getState() == 6) {
            if (m190575n(j, 2)) {
                if (playbackState.getState() == 3) {
                    this.f319074m.setImageResource(R.drawable.quantum_ic_pause_white_36);
                    this.f319063b.setOnClickListener(new C89943l(new C115064i(this)));
                }
            } else if (!m190575n(j, 1)) {
                this.f319063b.setOnClickListener((View.OnClickListener) null);
            } else if (playbackState.getState() == 3) {
                this.f319074m.setImageResource(R.drawable.quantum_ic_stop_white_36);
                this.f319063b.setOnClickListener(new C89943l(new C115065j(this)));
            }
        } else if (playbackState.getState() != 2 && playbackState.getState() != 1) {
        } else {
            if (!m190575n(j, 4)) {
                this.f319063b.setOnClickListener((View.OnClickListener) null);
            } else if (playbackState.getState() == 2 || playbackState.getState() == 1) {
                this.f319074m.setImageResource(R.drawable.quantum_ic_play_arrow_white_36);
                this.f319063b.setOnClickListener(new C89943l(new C115063h(this)));
            }
        }
    }

    /* renamed from: l */
    public final void mo101764l(MediaMetadata mediaMetadata) {
        Drawable drawable;
        try {
            TextView textView = (TextView) this.f319067f.findViewById(R.id.amb_media_playing_title);
            textView.setSelected(true);
            textView.setText(mediaMetadata.getString("android.media.metadata.TITLE"));
            ((TextView) this.f319067f.findViewById(R.id.amb_media_playing_artist)).setText(mediaMetadata.getString("android.media.metadata.ARTIST"));
            if (mediaMetadata.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl")) {
                drawable = this.f319064c.getResources().getDrawable(R.drawable.product_logo_podcasts_round_color_24);
            } else {
                PackageManager packageManager = this.f319064c.getPackageManager();
                MediaController mediaController = this.f319070i;
                mediaController.getClass();
                drawable = packageManager.getApplicationIcon(mediaController.getPackageName());
            }
            if (drawable != null) {
                ((ImageView) this.f319067f.findViewById(R.id.amb_media_playing_icon)).setImageDrawable(drawable);
            }
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
            C58976aa aaVar = C58975e.f156826a;
            if (bitmap != null) {
                mo101761h(new BitmapDrawable(bitmap));
            } else if (string != null) {
                this.f319065d.mo28211k(((C91189au) this.f319075n.mo27525b()).mo85418e(Uri.parse(string), 7), "Load album art", new C115066k(this));
            } else {
                mo101761h((Drawable) null);
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f319064c, "com.google.android.apps.gsa.staticplugins.opa.experience.OpaMActivity"));
            intent.putExtra("use_charging", true);
            if (mo101765m()) {
                intent.putExtra("disable_auto_dismiss_when_dark", true);
            }
            this.f319067f.setOnClickListener(new C89943l(new C115062g(this, intent)));
        } catch (PackageManager.NameNotFoundException e) {
            C59104x c = f319062a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AmbientMediaSC");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(29460)).mo56386p("Media app icon not found");
        }
    }

    /* renamed from: m */
    public final boolean mo101765m() {
        C58976aa aaVar = C58975e.f156826a;
        MediaController mediaController = this.f319070i;
        if (mediaController == null || mediaController.getMetadata() == null || this.f319070i.getPlaybackState() == null) {
            return false;
        }
        MediaController mediaController2 = this.f319070i;
        mediaController2.getClass();
        PlaybackState playbackState = mediaController2.getPlaybackState();
        playbackState.getClass();
        int state = playbackState.getState();
        if (state == 3 || state == 6 || state == 2 || state == 1) {
            return true;
        }
        return false;
    }
}
