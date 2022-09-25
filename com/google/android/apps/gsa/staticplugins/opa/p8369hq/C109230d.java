package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.d */
/* compiled from: PG */
public enum C109230d {
    DEFAULT(0, R.drawable.valyrian_explore_icon, R.drawable.valyrian_explore_icon, R.drawable.quantum_ic_explore_googblue_24),
    COMPASS_BADGE(6, R.drawable.valyrian_explore_icon, R.drawable.valyrian_explore_updates_center_icon_red, R.drawable.quantum_ic_explore_googblue_24),
    BELL(7, R.drawable.valyrian_updates_center_bell_icon, R.drawable.valyrian_updates_center_bell_icon_red, R.drawable.valyrian_updates_center_bell_blue),
    BULLETIN(8, R.drawable.valyrian_updates_center_bulletin_icon, R.drawable.valyrian_updates_center_bulletin_icon_red, R.drawable.valyrian_updates_center_bulletin_blue),
    CLIPBOARD(9, R.drawable.valyrian_updates_center_clipboard_icon, R.drawable.valyrian_updates_center_clipboard_icon_red, R.drawable.valyrian_updates_center_clipboard_blue),
    CLOCK(10, R.drawable.valyrian_updates_center_clock_icon, R.drawable.valyrian_updates_center_clock_icon_red, R.drawable.valyrian_updates_center_clock_blue),
    ENVELOPE(11, R.drawable.valyrian_updates_center_envelope_icon, R.drawable.valyrian_updates_center_envelope_icon_red, R.drawable.valyrian_updates_center_envelope_blue),
    LIST(12, R.drawable.valyrian_updates_center_list_icon, R.drawable.valyrian_updates_center_list_icon_red, R.drawable.valyrian_updates_center_list_blue),
    TIMEPASS(13, R.drawable.valyrian_timepass_icon, R.drawable.valyrian_timepass_icon, R.drawable.valyrian_timepass_icon);
    

    /* renamed from: n */
    private static final C58495hd f304161n = null;

    /* renamed from: j */
    public final long f304163j;

    /* renamed from: k */
    public final int f304164k;

    /* renamed from: l */
    public final int f304165l;

    /* renamed from: m */
    public final int f304166m;

    static {
        f304161n = C58495hd.m89898l((Map) Stream.CC.m71936of((T[]) values()).collect(Collectors.toMap(C109229c.f304151a, Function.CC.identity())));
    }

    private C109230d(long j, int i, int i2, int i3) {
        this.f304163j = j;
        this.f304164k = i;
        this.f304165l = i2;
        this.f304166m = i3;
    }

    /* renamed from: a */
    public static C109230d m181787a(long j) {
        C109230d dVar = (C109230d) f304161n.get(Long.valueOf(j));
        return dVar == null ? DEFAULT : dVar;
    }
}
