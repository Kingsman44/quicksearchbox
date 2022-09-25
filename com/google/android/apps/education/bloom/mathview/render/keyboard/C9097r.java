package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.r */
/* compiled from: PG */
public class C9097r extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public static C9078ae f31359a;

    /* renamed from: b */
    public C69626l f31360b;

    /* renamed from: c */
    public C69626l f31361c;

    /* renamed from: d */
    public List f31362d;

    /* renamed from: e */
    public final List f31363e = new ArrayList();

    /* renamed from: f */
    public final int f31364f;

    /* renamed from: g */
    public final C9096q f31365g;

    public C9097r(View view, SparseIntArray sparseIntArray) {
        super(view);
        int integer = view.getResources().getInteger(R.integer.max_overflow_cols);
        this.f31364f = integer + integer + 1;
        this.f31365g = new C9096q();
        C69664n.m101059e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C69664n.m101060f(childAt, "getChildAt(index)");
            if (childAt instanceof TextView) {
                Context context = ((TextView) childAt).getContext();
                C69664n.m101060f(context, "child.context");
                C9078ae aeVar = f31359a;
                if (aeVar == null) {
                    aeVar = new C9078ae(context.getResources().getDimension(R.dimen.key_max_text_size));
                    f31359a = aeVar;
                }
                aeVar.mo17401c(childAt);
            }
            if (childAt instanceof ImageView) {
                C9088i.f31339a.mo17405a((ImageView) childAt);
            }
            if (childAt.isClickable()) {
                childAt.setOnClickListener(this);
                childAt.setOnLongClickListener(new C9094o(this, childAt, sparseIntArray.get(childAt.getId(), 0)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo17407a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List mo17408b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo17414c(boolean z) {
        C69626l lVar = this.f31361c;
        if (lVar != null) {
            lVar.mo5761a(Boolean.valueOf(z));
        }
    }

    public final void onClick(View view) {
        C69664n.m101061g(view, "v");
        C69626l lVar = this.f31360b;
        if (lVar != null) {
            lVar.mo5761a(view);
        }
    }
}
