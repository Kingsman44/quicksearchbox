package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47584ch;
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.DesugarCollections;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.i */
/* compiled from: PG */
final class C13153i extends C46756m {

    /* renamed from: a */
    public static final C59071e f40751a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.i");

    /* renamed from: d */
    private static final Map f40752d = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: b */
    public final C28443m f40753b;

    /* renamed from: c */
    public final C13169y f40754c;

    /* renamed from: e */
    private final boolean f40755e;

    /* renamed from: f */
    private final C47449e f40756f;

    /* renamed from: g */
    private final C47770dh f40757g;

    /* renamed from: h */
    private final PackageManager f40758h;

    /* renamed from: i */
    private final C28310af f40759i;

    /* renamed from: j */
    private final C28306ab f40760j;

    public C13153i(boolean z, C47449e eVar, C47770dh dhVar, PackageManager packageManager, C28310af afVar, C28443m mVar, C28306ab abVar, C13169y yVar) {
        this.f40755e = z;
        this.f40756f = eVar;
        this.f40757g = dhVar;
        this.f40758h = packageManager;
        this.f40759i = afVar;
        this.f40753b = mVar;
        this.f40760j = abVar;
        this.f40754c = yVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(true != this.f40755e ? R.layout.media_rec_album_button : R.layout.media_rec_grid_album_button, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        int i;
        String str;
        C51058ev evVar;
        Drawable drawable;
        Bitmap bitmap;
        C13152h hVar = (C13152h) obj;
        if (!this.f40755e) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (hVar.mo20932e()) {
                marginLayoutParams.rightMargin = (int) view.getResources().getDimension(R.dimen.media_rec_album_button_margin);
            }
            if (hVar.mo20931d()) {
                marginLayoutParams.leftMargin = (int) view.getResources().getDimension(R.dimen.media_rec_album_button_margin);
            }
        }
        if (hVar.mo20930c()) {
            ((TextView) view.findViewById(R.id.album_text)).setText(R.string.media_rec_play_something_else_text);
            view.findViewById(R.id.album_text).setVisibility(0);
            view.findViewById(R.id.title).setVisibility(8);
            view.findViewById(R.id.app_icon).setVisibility(8);
            view.findViewById(R.id.album_art_container).getLayoutParams().height = -1;
        } else {
            TextView textView = (TextView) view.findViewById(R.id.title);
            C52568wo woVar = hVar.mo20929b().f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if ((woVar.f137994a & 1) != 0) {
                str = woVar.f137998e;
            } else {
                str = woVar.f138000g;
            }
            textView.setText(str);
            C52560wg b = hVar.mo20929b();
            ImageView imageView = (ImageView) view.findViewById(R.id.app_icon);
            View findViewById = view.findViewById(R.id.default_app_icon);
            C52568wo woVar2 = b.f137950f;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            C52567wn b2 = C52567wn.m86649b(woVar2.f138003j);
            if (b2 == null) {
                b2 = C52567wn.UNKNOWN;
            }
            if (b2 == C52567wn.PODCAST_EPISODE) {
                imageView.setImageResource(R.drawable.product_logo_podcasts_round_color_48);
            } else {
                C52568wo woVar3 = b.f137950f;
                if (woVar3 == null) {
                    woVar3 = C52568wo.f137992v;
                }
                C52567wn b3 = C52567wn.m86649b(woVar3.f138003j);
                if (b3 == null) {
                    b3 = C52567wn.UNKNOWN;
                }
                if (b3 == C52567wn.NEWS) {
                    imageView.setImageResource(R.drawable.product_logo_google_news_round_color_48);
                } else {
                    C51098gh ghVar = b.f137949e;
                    if (ghVar == null) {
                        ghVar = C51098gh.f133009e;
                    }
                    if (ghVar.f133012b == 1) {
                        evVar = (C51058ev) ghVar.f133013c;
                    } else {
                        evVar = C51058ev.f132941o;
                    }
                    String str2 = evVar.f132944b;
                    Bitmap bitmap2 = (Bitmap) f40752d.get(str2);
                    if (bitmap2 != null) {
                        imageView.setImageBitmap(bitmap2);
                    } else {
                        try {
                            drawable = this.f40758h.getApplicationIcon(str2);
                        } catch (PackageManager.NameNotFoundException e) {
                            ((C59052c) ((C59052c) ((C59052c) f40751a.mo56226d()).mo56382g(e)).mo56372aa(44593)).mo56389s("Invalid package name: %s", str2);
                            drawable = null;
                        }
                        if (drawable == null) {
                            findViewById.setVisibility(0);
                        } else {
                            if (!(drawable instanceof BitmapDrawable)) {
                                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                bitmap.setDensity(imageView.getResources().getDisplayMetrics().densityDpi);
                                Canvas canvas = new Canvas(bitmap);
                                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                drawable.draw(canvas);
                                int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(R.dimen.media_rec_button_icon_size);
                                while (true) {
                                    int i2 = dimensionPixelSize + dimensionPixelSize;
                                    if (bitmap.getWidth() <= i2 || bitmap.getHeight() <= i2) {
                                        break;
                                    }
                                    bitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, true);
                                }
                            } else {
                                bitmap = ((BitmapDrawable) drawable).getBitmap();
                            }
                            f40752d.put(str2, bitmap);
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                }
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.album_photo);
            imageView2.setClipToOutline(true);
            C52568wo woVar4 = hVar.mo20929b().f137950f;
            if (woVar4 == null) {
                woVar4 = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar4.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if ((dcVar.f132815a & 8) != 0) {
                C63088z zVar = dcVar.f132819e;
                C47449e eVar = this.f40756f;
                ((C6007z) eVar.mo51286a().mo11874l(zVar.mo59174N()).mo11965R(C5997p.IMMEDIATE)).mo11982o(C5593j.m14521e()).mo12439a(new C13150f(imageView2)).mo12454r(imageView2);
            } else {
                ((C6007z) this.f40756f.mo51286a().mo11873k(dcVar.f132817c).mo11965R(C5997p.IMMEDIATE)).mo11982o(C5593j.m14521e()).mo12439a(new C13150f(imageView2)).mo12454r(imageView2);
            }
        }
        C28306ab abVar = this.f40760j;
        C28310af afVar = this.f40759i;
        if (hVar.mo20930c()) {
            i = 139692;
        } else {
            C52567wn wnVar = C52567wn.UNKNOWN;
            C52568wo woVar5 = hVar.mo20929b().f137950f;
            if (woVar5 == null) {
                woVar5 = C52568wo.f137992v;
            }
            C52567wn b4 = C52567wn.m86649b(woVar5.f138003j);
            if (b4 == null) {
                b4 = C52567wn.UNKNOWN;
            }
            int ordinal = b4.ordinal();
            if (ordinal == 0) {
                i = 139642;
            } else if (ordinal == 21) {
                i = 139640;
            } else if (ordinal != 9) {
                if (ordinal != 10) {
                    if (ordinal == 13) {
                        i = 144468;
                    } else if (ordinal != 14) {
                        i = 144469;
                    }
                }
                i = 139639;
            } else {
                i = 139641;
            }
        }
        abVar.mo33802c(view, afVar.mo33805a(C28427h.m53115a(i)));
        view.setOnClickListener(new C13147c(this, hVar));
        C47770dh dhVar = this.f40757g;
        Objects.requireNonNull(this.f40754c);
        view.setOnTouchListener(new C47586cj(dhVar, new C13148d(), "MediaItemViewBinder:media item touched"));
        C47770dh dhVar2 = this.f40757g;
        C13169y yVar = this.f40754c;
        Objects.requireNonNull(yVar);
        view.setOnKeyListener(new C47584ch(dhVar2, "MediaItemViewBinder:key pressed on media item", new C13149e(yVar)));
    }
}
