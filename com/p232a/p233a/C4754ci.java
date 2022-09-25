package com.p232a.p233a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.ci */
/* compiled from: PG */
enum C4754ci {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;
    

    /* renamed from: G */
    private static final Map f15029G = null;

    static {
        f15029G = new HashMap();
    }

    /* renamed from: a */
    public static C4754ci m13207a(String str) {
        Map map = f15029G;
        C4754ci ciVar = (C4754ci) map.get(str);
        if (ciVar != null) {
            return ciVar;
        }
        if (!str.equals("switch")) {
            try {
                C4754ci ciVar2 = (C4754ci) Enum.valueOf(C4754ci.class, str);
                if (ciVar2 != SWITCH) {
                    map.put(str, ciVar2);
                    return ciVar2;
                }
            } catch (IllegalArgumentException unused) {
            }
            Map map2 = f15029G;
            C4754ci ciVar3 = UNSUPPORTED;
            map2.put(str, ciVar3);
            return ciVar3;
        }
        C4754ci ciVar4 = SWITCH;
        map.put(str, ciVar4);
        return ciVar4;
    }
}
