package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.g */
/* compiled from: PG */
public enum C65549g {
    LENS_CLICK_ACTION,
    READ_CLICK_ACTION,
    ACTION_NOT_SET;

    /* renamed from: a */
    public static C65549g m96723a(int i) {
        if (i == 0) {
            return ACTION_NOT_SET;
        }
        if (i == 1) {
            return LENS_CLICK_ACTION;
        }
        if (i != 2) {
            return null;
        }
        return READ_CLICK_ACTION;
    }
}
