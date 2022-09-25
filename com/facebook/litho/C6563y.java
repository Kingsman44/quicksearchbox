package com.facebook.litho;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.p060c.C0985o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.y */
/* compiled from: PG */
final class C6563y {
    /* renamed from: a */
    static TextContent m17862a(List list) {
        int size = list.size();
        if (size == 1) {
            Object obj = list.get(0);
            return obj instanceof TextContent ? (TextContent) obj : TextContent.f17954b;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
        }
        return new C6562x(arrayList);
    }

    /* renamed from: b */
    static void m17863b(View view, Drawable drawable, int i, C6248ev evVar) {
        if (((evVar != null && evVar.mo13067ai()) || C6185de.m16311d(i)) && drawable.isStateful()) {
            drawable.setState(view.getDrawableState());
        }
    }

    /* renamed from: c */
    static void m17864c(int i, int i2, C0985o oVar, C0985o oVar2) {
        Object obj;
        if (m17867f(i, oVar2)) {
            obj = oVar2.mo3726e(i);
            oVar2.mo3731j(i);
        } else {
            obj = oVar.mo3726e(i);
            oVar.mo3731j(i);
        }
        oVar.mo3730i(i2, obj);
    }

    /* renamed from: d */
    static void m17865d(int i, C0985o oVar, C0985o oVar2) {
        if (m17867f(i, oVar2)) {
            oVar2.mo3731j(i);
        } else {
            oVar.mo3731j(i);
        }
    }

    /* renamed from: e */
    static void m17866e(int i, C0985o oVar, C0985o oVar2) {
        Object e;
        if (oVar != null && oVar2 != null && (e = oVar.mo3726e(i)) != null) {
            oVar2.mo3730i(i, e);
        }
    }

    /* renamed from: f */
    static boolean m17867f(int i, C0985o oVar) {
        return (oVar == null || oVar.mo3726e(i) == null) ? false : true;
    }
}
