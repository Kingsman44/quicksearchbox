package com.google.p3723ar.core;

/* renamed from: com.google.ar.core.u */
/* compiled from: PG */
enum C47915u {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, (int) null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    EARTH(1095893257, Earth.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class),
    MAGICAL_SURFACE_POINT(1095893267, MagicalSurfacePoint.class);
    

    /* renamed from: k */
    final int f124106k;

    /* renamed from: m */
    private final Class f124107m;

    private C47915u(int i, Class cls) {
        this.f124106k = i;
        this.f124107m = cls;
    }

    /* renamed from: a */
    public static C47915u m85123a(Class cls) {
        for (C47915u uVar : values()) {
            Class cls2 = uVar.f124107m;
            if (cls2 != null && cls2.equals(cls)) {
                return uVar;
            }
        }
        return UNKNOWN_TO_JAVA;
    }
}
