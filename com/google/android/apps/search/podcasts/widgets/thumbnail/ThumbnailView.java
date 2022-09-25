package com.google.android.apps.search.podcasts.widgets.thumbnail;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ThumbnailView extends FrameLayout {

    /* renamed from: a */
    public static final C59071e f383558a = C59071e.m91331h();

    /* renamed from: b */
    public String f383559b;

    /* renamed from: c */
    public final AppCompatImageView f383560c;

    /* renamed from: d */
    private String f383561d;

    /* renamed from: e */
    private final View f383562e;

    /* renamed from: f */
    private final View f383563f;

    /* renamed from: g */
    private Integer f383564g;

    /* renamed from: h */
    private boolean f383565h;

    /* renamed from: i */
    private final C5592i f383566i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbnailView(Context context) {
        this(context, (AttributeSet) null, 2, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
        this.f383560c = new AppCompatImageView(context);
        this.f383566i = new C141282c(this);
        LayoutInflater.from(context).inflate(R.layout.podcasts_thumbnail_view, this);
        View childAt = getChildAt(0);
        C69664n.m101060f(childAt, "getChildAt(0)");
        this.f383562e = childAt;
        View findViewById = findViewById(R.id.podcasts_title_overlay);
        if (findViewById != null) {
            this.f383563f = findViewById;
            setClipToOutline(true);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C141280a.f383567a, 0, 0);
            C69664n.m101060f(obtainStyledAttributes, "context.theme.obtainStyl…defStyleRes= */ 0\n      )");
            try {
                C141281b bVar = new C141281b(obtainStyledAttributes.getDimension(0, 0.0f), C1878d.m5128a(getContext(), R.color.google_daynight_default_color_hairline));
                obtainStyledAttributes.recycle();
                setBackground(bVar);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m229315d(ThumbnailView thumbnailView, String str, String str2, C47449e eVar, String str3, boolean z, String str4, int i) {
        Drawable drawable;
        C6007z zVar;
        int i2 = 0;
        boolean z2 = z & ((i & 16) == 0);
        Integer num = null;
        if ((i & 32) != 0) {
            str4 = null;
        }
        C69664n.m101061g(str, "title");
        C69664n.m101061g(str2, "thumbnailUrl");
        C69664n.m101061g(eVar, "imageManager");
        if (!C69664n.m101066l(str2, thumbnailView.f383561d) || !C69664n.m101066l(str, thumbnailView.f383559b) || z2 != thumbnailView.f383565h) {
            if (str.length() != 0 && C69664n.m101066l(str, thumbnailView.f383559b) && thumbnailView.f383560c.getVisibility() == 0) {
                drawable = thumbnailView.f383560c.getDrawable();
            } else {
                drawable = null;
            }
            thumbnailView.f383561d = BuildConfig.FLAVOR;
            thumbnailView.f383559b = BuildConfig.FLAVOR;
            thumbnailView.f383562e.setBackgroundColor(0);
            thumbnailView.removeView(thumbnailView.f383560c);
            thumbnailView.f383560c.setScaleType(ImageView.ScaleType.CENTER_CROP);
            thumbnailView.addView(thumbnailView.f383560c, 0, new FrameLayout.LayoutParams(-1, -1));
            thumbnailView.f383560c.setVisibility(4);
            thumbnailView.f383563f.setVisibility(8);
            if (drawable != null) {
                thumbnailView.f383562e.setBackground(drawable);
            }
            if (!(str3 == null || str3.length() == 0)) {
                try {
                    num = Integer.valueOf(Color.parseColor("#" + str3));
                } catch (IllegalArgumentException e) {
                    C59052c cVar = (C59052c) ((C59052c) f383558a.mo56224b()).mo56382g(e);
                    cVar.mo56379ah(new C59094n(41661));
                    cVar.mo56389s("Could not parse thumbnail color: %s", str3);
                }
            }
            thumbnailView.f383564g = num;
            thumbnailView.f383561d = str2;
            thumbnailView.f383565h = z2;
            thumbnailView.f383559b = str;
            thumbnailView.setContentDescription(str);
            ViewStub viewStub = (ViewStub) thumbnailView.findViewById(R.id.podcasts_thumbnail_rss_feed_icon_view_stub);
            if (viewStub != null) {
                viewStub.setVisibility(true != z2 ? 8 : 0);
            }
            View findViewById = thumbnailView.findViewById(R.id.podcasts_thumbnail_rss_feed_icon_container);
            if (findViewById != null) {
                if (true != z2) {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
            }
            if (str2.length() == 0) {
                thumbnailView.mo116306c(str);
                return;
            }
            if (str4 != null) {
                zVar = eVar.mo51286a().mo11873k(str4).mo12451m(eVar.mo51286a().mo11873k(str2).mo12439a(thumbnailView.f383566i));
            } else {
                zVar = eVar.mo51286a().mo11873k(str2);
            }
            zVar.mo12439a(thumbnailView.f383566i).mo12454r(thumbnailView.f383560c);
        }
    }

    /* renamed from: a */
    public final void mo116304a(String str, String str2, C47449e eVar, String str3) {
        C69664n.m101061g(str, "title");
        C69664n.m101061g(str2, "thumbnailUrl");
        m229315d(this, str, str2, eVar, str3, false, (String) null, 48);
    }

    /* renamed from: b */
    public final void mo116305b(String str, String str2, C47449e eVar, String str3, boolean z) {
        C69664n.m101061g(str, "title");
        C69664n.m101061g(str2, "thumbnailUrl");
        m229315d(this, str, str2, eVar, str3, z, (String) null, 32);
    }

    /* renamed from: c */
    public final void mo116306c(String str) {
        if (str.length() != 0) {
            Integer num = this.f383564g;
            if (num != null) {
                this.f383562e.setBackgroundColor(num.intValue());
            }
            this.f383563f.setVisibility(0);
            View findViewById = findViewById(R.id.podcasts_thumbnail_title_text);
            C69664n.m101059e(findViewById, "null cannot be cast to non-null type com.google.android.apps.search.podcasts.widgets.thumbnail.FontFitTextView");
            FontFitTextView fontFitTextView = (FontFitTextView) findViewById;
            View findViewById2 = findViewById(R.id.podcasts_thumbnail_title_line);
            C69664n.m101060f(findViewById2, "findViewById(R.id.podcasts_thumbnail_title_line)");
            C69664n.m101061g(findViewById2, "underline");
            fontFitTextView.f383557a = findViewById2;
            fontFitTextView.mo116302a(fontFitTextView.getWidth());
            fontFitTextView.setText(str);
            fontFitTextView.setMaxLines(getContext().getResources().getInteger(R.integer.podcasts_thumbnail_title_max_lines));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailView(Context context, AttributeSet attributeSet, int i, C69659i iVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
