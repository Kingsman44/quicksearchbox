package com.google.android.p3545q.p3546a;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.apps.p3589d.p3590a.C45683ab;
import com.google.apps.p3589d.p3590a.C45684ac;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.q.a.b */
/* compiled from: PG */
public final class C45204b {

    /* renamed from: a */
    private static C45203a f117962a;

    /* renamed from: a */
    public static final void m80490a(ImageView imageView, String str, Typeface typeface, C45203a aVar) {
        C69664n.m101061g(imageView, "view");
        C69664n.m101061g(str, "latex");
        C69664n.m101061g(typeface, "xitsTypeface");
        if (aVar == null) {
            Context context = imageView.getContext();
            C69664n.m101060f(context, "view.context");
            C45203a aVar2 = f117962a;
            if (aVar2 == null) {
                aVar2 = new C45203a(TypedValue.applyDimension(2, 14.0f, context.getResources().getDisplayMetrics()), false, 0, 30);
                f117962a = aVar2;
            }
            aVar = aVar2;
        }
        C45684ac a = C45683ab.m81368a(str, aVar.mo49031a());
        Drawable drawable = imageView.getDrawable();
        C45206d dVar = drawable instanceof C45206d ? (C45206d) drawable : null;
        if (dVar != null) {
            dVar.mo49046k(aVar.f117959a);
        } else {
            dVar = new C45206d(aVar.f117959a);
        }
        dVar.mo49044i(a);
        dVar.mo49047l(typeface);
        imageView.setImageDrawable(dVar);
    }
}
