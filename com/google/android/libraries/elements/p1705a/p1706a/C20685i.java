package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.AlignItems;
import com.google.android.libraries.elements.interfaces.DimensionEdgesProxy;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.FlexDirection;
import com.google.android.libraries.elements.interfaces.FlexWrap;
import com.google.android.libraries.elements.interfaces.JustifyContent;
import com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy;
import com.google.android.libraries.elements.interfaces.Position;
import com.google.android.libraries.elements.interfaces.SemanticContentAttribute;
import com.google.p370af.C7490c;
import com.youtube.p5283a.p5284a.C68056as;
import com.youtube.p5283a.p5284a.C68101w;
import com.youtube.p5283a.p5284a.C68102x;

/* renamed from: com.google.android.libraries.elements.a.a.i */
/* compiled from: PG */
public final class C20685i extends LayoutPropertiesProxy {

    /* renamed from: a */
    public final C68056as f57970a;

    public C20685i(C68056as asVar) {
        this.f57970a = asVar;
    }

    /* renamed from: a */
    static DimensionEdgesProxy m38862a(C68102x xVar) {
        if (xVar != null) {
            return new C20680d(xVar);
        }
        return null;
    }

    public final AlignItems alignContent() {
        C68056as asVar = this.f57970a;
        int a = asVar.mo16913a(26);
        return m38863b(a != 0 ? asVar.f24704b.getInt(a + asVar.f24703a) : 0);
    }

    public final AlignItems alignItems() {
        C68056as asVar = this.f57970a;
        int a = asVar.mo16913a(28);
        return m38863b(a != 0 ? asVar.f24704b.getInt(a + asVar.f24703a) : 0);
    }

    public final AlignItems alignSelf() {
        C68056as asVar = this.f57970a;
        int a = asVar.mo16913a(36);
        return m38863b(a != 0 ? asVar.f24704b.getInt(a + asVar.f24703a) : 0);
    }

    public final float aspectRatio() {
        return this.f57970a.mo60128g();
    }

    public final DimensionProxy flexBasis() {
        C68056as asVar = this.f57970a;
        C68101w wVar = new C68101w();
        int a = asVar.mo16913a(34);
        if (a != 0) {
            wVar.mo16912a(a + asVar.f24703a, asVar.f24704b);
        } else {
            wVar = null;
        }
        return C20680d.m38861a(wVar);
    }

    public final FlexDirection flexDirection() {
        int j = this.f57970a.mo60131j();
        if (j == 1) {
            return FlexDirection.FLEX_DIRECTION_ROW;
        }
        if (j == 2) {
            return FlexDirection.FLEX_DIRECTION_ROW_REVERSE;
        }
        if (j == 3) {
            return FlexDirection.FLEX_DIRECTION_COLUMN;
        }
        if (j != 4) {
            return FlexDirection.FLEX_DIRECTION_UNKNOWN;
        }
        return FlexDirection.FLEX_DIRECTION_COLUMN_REVERSE;
    }

    public final float flexGrow() {
        return this.f57970a.mo60129h();
    }

    public final float flexShrink() {
        return this.f57970a.mo60130i();
    }

    public final FlexWrap flexWrap() {
        C68056as asVar = this.f57970a;
        int a = asVar.mo16913a(44);
        if (a != 0) {
            int i = asVar.f24704b.getInt(a + asVar.f24703a);
            if (i == 1) {
                return FlexWrap.FLEX_WRAP_NO_WRAP;
            }
            if (i == 2) {
                return FlexWrap.FLEX_WRAP_WRAP;
            }
            if (i == 3) {
                return FlexWrap.FLEX_WRAP_WRAP_REVERSE;
            }
        }
        return FlexWrap.FLEX_WRAP_UNKNOWN;
    }

    public final boolean hasAspectRatio() {
        return C7490c.m22726p(this.f57970a, 40);
    }

    public final boolean hasFlexGrow() {
        return C7490c.m22726p(this.f57970a, 30);
    }

    public final boolean hasFlexShrink() {
        return C7490c.m22726p(this.f57970a, 32);
    }

    public final DimensionProxy height() {
        return C20680d.m38861a(this.f57970a.mo60132k());
    }

    public final JustifyContent justifyContent() {
        C68056as asVar = this.f57970a;
        int a = asVar.mo16913a(24);
        if (a != 0) {
            switch (asVar.f24704b.getInt(a + asVar.f24703a)) {
                case 1:
                    return JustifyContent.JUSTIFY_CONTENT_FLEX_START;
                case 2:
                    return JustifyContent.JUSTIFY_CONTENT_FLEX_END;
                case 3:
                    return JustifyContent.JUSTIFY_CONTENT_CENTER;
                case 4:
                    return JustifyContent.JUSTIFY_CONTENT_BETWEEN;
                case 5:
                    return JustifyContent.JUSTIFY_CONTENT_SPACE_AROUND;
                case 6:
                    return JustifyContent.JUSTIFY_CONTENT_SPACE_EVENLY;
            }
        }
        return JustifyContent.JUSTIFY_CONTENT_UNKNOWN;
    }

    public final DimensionEdgesProxy margin() {
        return m38862a(this.f57970a.mo60134m());
    }

    public final DimensionProxy maxHeight() {
        C68056as asVar = this.f57970a;
        C68101w wVar = new C68101w();
        int a = asVar.mo16913a(16);
        if (a != 0) {
            wVar.mo16912a(a + asVar.f24703a, asVar.f24704b);
        } else {
            wVar = null;
        }
        return C20680d.m38861a(wVar);
    }

    public final DimensionProxy maxWidth() {
        C68056as asVar = this.f57970a;
        C68101w wVar = new C68101w();
        int a = asVar.mo16913a(14);
        if (a != 0) {
            wVar.mo16912a(a + asVar.f24703a, asVar.f24704b);
        } else {
            wVar = null;
        }
        return C20680d.m38861a(wVar);
    }

    public final DimensionProxy minHeight() {
        C68056as asVar = this.f57970a;
        C68101w wVar = new C68101w();
        int a = asVar.mo16913a(12);
        if (a != 0) {
            wVar.mo16912a(a + asVar.f24703a, asVar.f24704b);
        } else {
            wVar = null;
        }
        return C20680d.m38861a(wVar);
    }

    public final DimensionProxy minWidth() {
        C68056as asVar = this.f57970a;
        C68101w wVar = new C68101w();
        int a = asVar.mo16913a(10);
        if (a != 0) {
            wVar.mo16912a(a + asVar.f24703a, asVar.f24704b);
        } else {
            wVar = null;
        }
        return C20680d.m38861a(wVar);
    }

    public final DimensionEdgesProxy padding() {
        C68056as asVar = this.f57970a;
        C68102x xVar = new C68102x();
        int a = asVar.mo16913a(20);
        if (a != 0) {
            int i = a + asVar.f24703a;
            xVar.mo16917e(i + asVar.f24704b.getInt(i), asVar.f24704b);
        } else {
            xVar = null;
        }
        return m38862a(xVar);
    }

    public final DimensionEdgesProxy position() {
        C68056as asVar = this.f57970a;
        C68102x xVar = new C68102x();
        int a = asVar.mo16913a(4);
        if (a != 0) {
            int i = a + asVar.f24703a;
            xVar.mo16917e(i + asVar.f24704b.getInt(i), asVar.f24704b);
        } else {
            xVar = null;
        }
        return m38862a(xVar);
    }

    public final Position positionType() {
        C68056as asVar = this.f57970a;
        int a = asVar.mo16913a(38);
        if (a != 0) {
            int i = asVar.f24704b.getInt(a + asVar.f24703a);
            if (i == 1) {
                return Position.POSITION_RELATIVE;
            }
            if (i == 2) {
                return Position.POSITION_ABSOLUTE;
            }
        }
        return Position.POSITION_UNKNOWN;
    }

    public final SemanticContentAttribute semanticContentAttribute() {
        C68056as asVar = this.f57970a;
        int a = asVar.mo16913a(42);
        if (a != 0) {
            int i = asVar.f24704b.getInt(a + asVar.f24703a);
            if (i == 1) {
                return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_LTR;
            }
            if (i == 2) {
                return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_RTL;
            }
            if (i == 3) {
                return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_PLAYBACK;
            }
            if (i == 4) {
                return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_SPATIAL;
            }
        }
        return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_UNKNOWN;
    }

    public final DimensionProxy width() {
        return C20680d.m38861a(this.f57970a.mo60133l());
    }

    /* renamed from: b */
    public static final AlignItems m38863b(int i) {
        switch (i) {
            case 1:
                return AlignItems.ALIGN_ITEMS_AUTO;
            case 2:
                return AlignItems.ALIGN_ITEMS_START;
            case 3:
                return AlignItems.ALIGN_ITEMS_END;
            case 4:
                return AlignItems.ALIGN_ITEMS_CENTER;
            case 5:
                return AlignItems.ALIGN_ITEMS_STRETCH;
            case 6:
                return AlignItems.ALIGN_ITEMS_BASELINE_FIRST;
            case 7:
                return AlignItems.ALIGN_ITEMS_BASELINE_LAST;
            default:
                return AlignItems.ALIGN_ITEMS_UNKNOWN;
        }
    }
}
