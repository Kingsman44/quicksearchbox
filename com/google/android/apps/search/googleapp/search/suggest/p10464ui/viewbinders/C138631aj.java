package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p299c.p300a.C5837ap;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.C138022an;
import com.google.android.apps.search.googleapp.search.suggest.C138024ap;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138577b;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54250n;
import com.google.protos.p4948ba.C64380j;
import com.google.protos.p4948ba.C64383m;
import com.google.protos.p4948ba.C64384n;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.aj */
/* compiled from: PG */
public final class C138631aj {

    /* renamed from: a */
    public final Context f377026a;

    /* renamed from: b */
    public final C47400m f377027b;

    /* renamed from: c */
    public final C138630ai f377028c;

    /* renamed from: d */
    private final C138633al f377029d;

    /* renamed from: e */
    private final C5857f f377030e;

    /* renamed from: f */
    private final boolean f377031f;

    public C138631aj(Context context, C47400m mVar, C138630ai aiVar, C138633al alVar, boolean z) {
        this.f377026a = context;
        this.f377027b = mVar;
        this.f377028c = aiVar;
        this.f377029d = alVar;
        this.f377030e = new C5837ap(context.getResources().getDimensionPixelSize(R.dimen.googleapp_entity_suggestion_image_corner_radius));
        this.f377031f = z;
    }

    /* renamed from: a */
    public static int m225131a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return Color.parseColor(str);
    }

    /* renamed from: b */
    static Intent m225132b(C138025aq aqVar) {
        String str;
        int i;
        int i2;
        int i3 = aqVar.f375514a;
        if ((i3 & 2) != 0) {
            C138022an anVar = aqVar.f375516c;
            if (anVar == null) {
                anVar = C138022an.f375501e;
            }
            str = anVar.f375505c;
            i2 = 3;
            i = 270532609;
        } else if ((i3 & 4) != 0) {
            C138024ap apVar = aqVar.f375517d;
            if (apVar == null) {
                apVar = C138024ap.f375507d;
            }
            str = apVar.f375511c;
            i2 = 0;
            i = 270565377;
        } else {
            throw new IllegalArgumentException();
        }
        return Intent.parseUri(str, i2).setFlags(i);
    }

    /* renamed from: c */
    static C138577b m225133c(C138030av avVar, String str) {
        Intent intent;
        try {
            C138025aq aqVar = avVar.f375548l;
            if (aqVar == null) {
                aqVar = C138025aq.f375512e;
            }
            intent = m225132b(aqVar);
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) ((C58970a) C58974d.m91134h(str).mo56225c()).mo56382g(e)).mo56372aa(41279)).mo56389s("Unable to build an intent for the suggestion click: %s", avVar.f375539b);
            intent = null;
        }
        return new C138577b(intent, avVar);
    }

    /* renamed from: h */
    public static String m225134h(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return aeVar.f142295f;
    }

    /* renamed from: i */
    public static String m225135i(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return aeVar.f142308s;
    }

    /* renamed from: k */
    public static boolean m225136k(C138030av avVar) {
        if ((avVar.f375538a & 8) == 0) {
            return false;
        }
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return aeVar.f142307r;
    }

    /* renamed from: l */
    public static boolean m225137l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("data:")) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final void m225138o(ImageView imageView, int i) {
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    /* renamed from: p */
    public static final void m225139p(TextView textView, CharSequence charSequence, int i) {
        textView.setText(charSequence);
        textView.setVisibility(0);
        if (i == 2) {
            textView.setSingleLine(true);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i == 3) {
            textView.setSingleLine(true);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else {
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: q */
    public static int m225140q(C138030av avVar, int i) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        if ((aeVar.f142290a & 2) != 0) {
            C54228aq aqVar2 = avVar.f375543g;
            if (aqVar2 == null) {
                aqVar2 = C54228aq.f142328w;
            }
            C54216ae aeVar2 = aqVar2.f142334f;
            if (aeVar2 == null) {
                aeVar2 = C54216ae.f142285C;
            }
            int a = C64380j.m96396a(aeVar2.f142292c);
            if (a == 0) {
                a = 1;
            }
            int r = m225141r(a);
            if (r != -1) {
                return r;
            }
        }
        return m225141r(i);
    }

    /* renamed from: r */
    public static int m225141r(int i) {
        int i2 = i - 1;
        if (i2 == 7) {
            return R.drawable.quantum_gm_ic_public_vd_theme_24;
        }
        if (i2 == 27) {
            return R.drawable.quantum_ic_access_time_vd_theme_24;
        }
        if (i2 == 33) {
            return R.drawable.quantum_gm_ic_trending_up_vd_theme_24;
        }
        if (i2 != 43) {
            return -1;
        }
        return R.drawable.quantum_ic_search_vd_theme_24;
    }

    /* renamed from: d */
    public final C138590o mo114432d(C138030av avVar, int i) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        C64384n nVar = aeVar.f142313x;
        if (nVar == null) {
            nVar = C64384n.f174622b;
        }
        C64383m a = C64383m.m96397a(nVar.f174624a);
        if (a == null) {
            a = C64383m.CATEGORY_UNSPECIFIED;
        }
        int a2 = C138630ai.m225126a(a, i);
        String d = this.f377028c.mo114430d(avVar);
        if (d != null) {
            return C138589n.m225046a(avVar, this.f377026a.getString(a2), d, true);
        }
        return C138589n.m225047b(avVar, this.f377026a.getString(a2), true);
    }

    /* renamed from: e */
    public final CharSequence mo114433e(C138030av avVar, boolean z) {
        if ((avVar.f375538a & 8) != 0) {
            C54228aq aqVar = avVar.f375543g;
            if (aqVar == null) {
                aqVar = C54228aq.f142328w;
            }
            C54216ae aeVar = aqVar.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            if ((aeVar.f142290a & 8) != 0) {
                C54216ae aeVar2 = aqVar.f142334f;
                if (aeVar2 == null) {
                    aeVar2 = C54216ae.f142285C;
                }
                String str = aeVar2.f142294e;
                if (z) {
                    return this.f377029d.mo114441b(str);
                }
                return C138633al.m225149a(str);
            }
        }
        return z ? this.f377029d.mo114441b(avVar.f375540c) : avVar.f375539b;
    }

    /* renamed from: f */
    public final CharSequence mo114434f(C138030av avVar, boolean z) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        if ((aqVar.f142330a & 32) == 0) {
            return BuildConfig.FLAVOR;
        }
        C54228aq aqVar2 = avVar.f375543g;
        if (aqVar2 == null) {
            aqVar2 = C54228aq.f142328w;
        }
        C54250n nVar = aqVar2.f142337i;
        if (nVar == null) {
            nVar = C54250n.f142445d;
        }
        String str = nVar.f142449c;
        if (z) {
            return this.f377029d.mo114441b(str);
        }
        return C138633al.m225149a(str);
    }

    /* renamed from: g */
    public final CharSequence mo114435g(C138030av avVar, boolean z) {
        return z ? this.f377029d.mo114441b(avVar.f375540c) : avVar.f375539b;
    }

    /* renamed from: j */
    public final void mo114436j(C47449e eVar, ImageView imageView, String str, int i) {
        C6007z h = eVar.mo51286a().mo11870h(Uri.parse(str));
        float dimensionPixelSize = (float) this.f377026a.getResources().getDimensionPixelSize(R.dimen.googleapp_entity_suggestion_image_corner_radius);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize}, (RectF) null, (float[]) null));
        int dimensionPixelSize2 = this.f377026a.getResources().getDimensionPixelSize(R.dimen.googleapp_entity_suggestion_placeholder_size);
        shapeDrawable.setIntrinsicHeight(dimensionPixelSize2);
        shapeDrawable.setIntrinsicWidth(dimensionPixelSize2);
        shapeDrawable.getPaint().setColor(i);
        ((C6007z) ((C6007z) ((C6007z) h.mo11964Q(shapeDrawable)).mo11953F(new ColorDrawable(0))).mo11969V(this.f377030e)).mo12454r(imageView);
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo114437m(C138030av avVar) {
        if (!this.f377031f) {
            return false;
        }
        C138025aq aqVar = avVar.f375548l;
        if (aqVar == null) {
            aqVar = C138025aq.f375512e;
        }
        return !aqVar.f375515b;
    }

    /* renamed from: n */
    public final String mo114438n() {
        return this.f377028c.mo114431e("delete_recent_history");
    }
}
