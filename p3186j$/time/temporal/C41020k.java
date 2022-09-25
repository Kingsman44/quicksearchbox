package p3186j$.time.temporal;

/* renamed from: j$.time.temporal.k */
public final /* synthetic */ class C41020k implements TemporalAdjuster {

    /* renamed from: a */
    public final /* synthetic */ int f107450a;

    /* renamed from: b */
    public final /* synthetic */ int f107451b;

    public /* synthetic */ C41020k(int i, int i2) {
        this.f107450a = i2;
        this.f107451b = i;
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        int i;
        int i2;
        int i3 = this.f107450a;
        int i4 = this.f107451b;
        switch (i3) {
            case 0:
                int i5 = temporal.get(ChronoField.DAY_OF_WEEK);
                if (i5 == i4) {
                    return temporal;
                }
                int i6 = i5 - i4;
                if (i6 >= 0) {
                    i2 = 7 - i6;
                } else {
                    i2 = -i6;
                }
                return temporal.mo43048g((long) i2, ChronoUnit.DAYS);
            default:
                int i7 = temporal.get(ChronoField.DAY_OF_WEEK) - i4;
                if (i7 >= 0) {
                    i = 7 - i7;
                } else {
                    i = -i7;
                }
                return temporal.mo43048g((long) i, ChronoUnit.DAYS);
        }
    }
}
