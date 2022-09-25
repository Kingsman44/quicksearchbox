package androidx.media3.p174ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p135a.C2567c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.ui.SubtitleView */
/* compiled from: PG */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a */
    public List f11674a;

    /* renamed from: b */
    public C3638b f11675b;

    /* renamed from: c */
    public int f11676c;

    /* renamed from: d */
    public float f11677d;

    /* renamed from: e */
    public float f11678e;

    /* renamed from: f */
    private boolean f11679f;

    /* renamed from: g */
    private boolean f11680g;

    /* renamed from: h */
    private C3655s f11681h;

    /* renamed from: i */
    private View f11682i;

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11674a = Collections.emptyList();
        this.f11675b = C3638b.f11697a;
        this.f11676c = 0;
        this.f11677d = 0.0533f;
        this.f11678e = 0.08f;
        this.f11679f = true;
        this.f11680g = true;
        C3637a aVar = new C3637a(context);
        this.f11681h = aVar;
        this.f11682i = aVar;
        addView(aVar);
    }

    /* renamed from: a */
    public final void mo7678a() {
        List list;
        C3655s sVar = this.f11681h;
        if (!this.f11679f || !this.f11680g) {
            list = new ArrayList(this.f11674a.size());
            for (int i = 0; i < this.f11674a.size(); i++) {
                C2566b bVar = new C2566b((C2567c) this.f11674a.get(i));
                if (!this.f11679f) {
                    bVar.f7078n = false;
                    CharSequence charSequence = bVar.f7065a;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            bVar.f7065a = SpannableString.valueOf(charSequence);
                        }
                        CharSequence charSequence2 = bVar.f7065a;
                        charSequence2.getClass();
                        C3658v.m10615c((Spannable) charSequence2, C3656t.f11788a);
                    }
                    C3658v.m10614b(bVar);
                } else if (!this.f11680g) {
                    C3658v.m10614b(bVar);
                }
                list.add(bVar.mo6076a());
            }
        } else {
            list = this.f11674a;
        }
        C3638b bVar2 = this.f11675b;
        float f = this.f11677d;
        int i2 = this.f11676c;
        float f2 = this.f11678e;
        C3637a aVar = (C3637a) sVar;
        aVar.f11692b = list;
        aVar.f11695e = bVar2;
        aVar.f11694d = f;
        aVar.f11693c = i2;
        aVar.f11696f = f2;
        while (aVar.f11691a.size() < list.size()) {
            aVar.f11691a.add(new C3654r(aVar.getContext()));
        }
        aVar.invalidate();
    }
}
