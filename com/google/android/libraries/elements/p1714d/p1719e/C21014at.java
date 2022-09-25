package com.google.android.libraries.elements.p1714d.p1719e;

import com.facebook.litho.C6139bt;
import com.facebook.litho.C6397j;
import com.facebook.litho.C6405o;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.DimensionUnit;
import com.google.android.libraries.elements.interfaces.FlexWrap;
import com.google.android.libraries.elements.interfaces.JustifyContent;
import com.google.android.libraries.elements.interfaces.Position;
import com.google.android.libraries.elements.interfaces.SemanticContentAttribute;
import com.google.android.libraries.elements.internal.C21343d;

/* renamed from: com.google.android.libraries.elements.d.e.at */
/* compiled from: PG */
public final /* synthetic */ class C21014at implements C21343d {

    /* renamed from: a */
    public final /* synthetic */ C6405o f58905a;

    public /* synthetic */ C21014at(C6405o oVar) {
        this.f58905a = oVar;
    }

    /* renamed from: a */
    public final void mo26055a(int i, DimensionProxy dimensionProxy) {
        C6405o oVar = this.f58905a;
        int i2 = C21017aw.f58908a;
        SemanticContentAttribute semanticContentAttribute = SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_UNKNOWN;
        JustifyContent justifyContent = JustifyContent.JUSTIFY_CONTENT_UNKNOWN;
        FlexWrap flexWrap = FlexWrap.FLEX_WRAP_UNKNOWN;
        Position position = Position.POSITION_UNKNOWN;
        DimensionUnit dimensionUnit = DimensionUnit.DIMENSION_UNIT_UNKNOWN;
        if (dimensionProxy.unit().ordinal() != 2) {
            oVar.mo13426J(i, dimensionProxy.value());
            return;
        }
        float value = dimensionProxy.value() * 100.0f;
        C6397j jVar = (C6397j) oVar.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 16777216;
        if (jVar.f18952y == null) {
            jVar.f18952y = new C6139bt();
        }
        jVar.f18952y.mo13122e(i, value);
        oVar.mo13268k();
    }
}
