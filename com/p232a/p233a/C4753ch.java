package com.p232a.p233a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.ch */
/* compiled from: PG */
enum C4753ch {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    id,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;
    

    /* renamed from: aO */
    private static final Map f14970aO = null;

    static {
        f14970aO = new HashMap();
    }

    /* renamed from: a */
    public static C4753ch m13206a(String str) {
        Map map = f14970aO;
        C4753ch chVar = (C4753ch) map.get(str);
        if (chVar != null) {
            return chVar;
        }
        if (str.equals("class")) {
            C4753ch chVar2 = CLASS;
            map.put(str, chVar2);
            return chVar2;
        } else if (str.indexOf(95) != -1) {
            C4753ch chVar3 = UNSUPPORTED;
            map.put(str, chVar3);
            return chVar3;
        } else {
            try {
                C4753ch chVar4 = (C4753ch) Enum.valueOf(C4753ch.class, str.replace('-', '_'));
                if (chVar4 != CLASS) {
                    map.put(str, chVar4);
                    return chVar4;
                }
            } catch (IllegalArgumentException unused) {
            }
            Map map2 = f14970aO;
            C4753ch chVar5 = UNSUPPORTED;
            map2.put(str, chVar5);
            return chVar5;
        }
    }
}
