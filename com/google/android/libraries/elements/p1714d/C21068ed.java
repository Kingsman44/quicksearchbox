package com.google.android.libraries.elements.p1714d;

import android.text.TextPaint;
import android.view.View;
import com.facebook.litho.widget.C6434at;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.p5283a.p5284a.C68097s;

/* renamed from: com.google.android.libraries.elements.d.ed */
/* compiled from: PG */
final class C21068ed extends C6434at {

    /* renamed from: a */
    private final C21313t f59056a;

    /* renamed from: b */
    private final C21256az f59057b;

    /* renamed from: c */
    private final C21357r f59058c;

    /* renamed from: d */
    private final C21357r f59059d;

    public C21068ed(C68097s sVar, C21313t tVar, C21359t tVar2, C21256az azVar, C21319z zVar) {
        this.f59056a = tVar;
        this.f59057b = azVar;
        this.f59058c = tVar2.mo26863g(sVar.mo60249k(), zVar);
        this.f59059d = tVar2.mo26863g(sVar.mo60248j(), zVar);
    }

    /* renamed from: a */
    public final boolean mo13514a(View view) {
        C21357r rVar = this.f59059d;
        if (rVar == null) {
            return false;
        }
        C21313t tVar = this.f59056a;
        CommandOuterClass$Command a = rVar.mo26862a();
        C21309p k = C21311r.m40252k();
        C21230a aVar = (C21230a) k;
        aVar.f59560a = view;
        aVar.f59565f = this.f59057b;
        tVar.mo26124a(a, k.mo26698a()).mo61453k();
        return true;
    }

    public final void onClick(View view) {
        C21357r rVar = this.f59058c;
        if (rVar != null) {
            C21313t tVar = this.f59056a;
            CommandOuterClass$Command a = rVar.mo26862a();
            C21309p k = C21311r.m40252k();
            C21230a aVar = (C21230a) k;
            aVar.f59560a = view;
            aVar.f59565f = this.f59057b;
            tVar.mo26124a(a, k.mo26698a()).mo61453k();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
