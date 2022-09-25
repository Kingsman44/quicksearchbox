package com.google.android.apps.search.googleapp.launcher.minusone;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.core.content.p091b.C1874w;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;
import com.google.p4479cg.C58063a;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62931bk;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.b */
/* compiled from: PG */
final class C136592b {
    /* renamed from: a */
    public static int m221991a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return C1874w.m5111h(context.getResources(), typedValue.resourceId);
        }
        return -16777216;
    }

    /* renamed from: b */
    public static int m221992b(C58070b bVar) {
        C62931bk bkVar = bVar.f155217d;
        return Color.argb((int) ((bkVar != null ? bkVar.f169957a : 1.0f) * 255.0f), (int) (bVar.f155214a * 255.0f), (int) (bVar.f155215b * 255.0f), (int) (bVar.f155216c * 255.0f));
    }

    /* renamed from: c */
    public static C58070b m221993c(Context context) {
        if (C133933a.m217248a(context)) {
            return m221994d(-16777216);
        }
        return m221994d(m221991a(context, R.attr.colorSurfaceVariant));
    }

    /* renamed from: d */
    public static C58070b m221994d(int i) {
        C58063a aVar = (C58063a) C58070b.f155212e.createBuilder();
        int red = Color.red(i);
        aVar.copyOnWrite();
        ((C58070b) aVar.instance).f155214a = ((float) red) / 255.0f;
        int green = Color.green(i);
        aVar.copyOnWrite();
        ((C58070b) aVar.instance).f155215b = ((float) green) / 255.0f;
        int blue = Color.blue(i);
        aVar.copyOnWrite();
        ((C58070b) aVar.instance).f155216c = ((float) blue) / 255.0f;
        C62931bk a = C62931bk.m95422a(((float) Color.alpha(i)) / 255.0f);
        aVar.copyOnWrite();
        a.getClass();
        ((C58070b) aVar.instance).f155217d = a;
        return (C58070b) aVar.build();
    }
}
