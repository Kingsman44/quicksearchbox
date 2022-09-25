package com.google.p3723ar.core.impress.analytics;

import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass */
/* compiled from: PG */
public final class ImpressLogOuterClass {

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$Duration */
    /* compiled from: PG */
    public final class Duration extends C62942bv implements DurationOrBuilder {
        /* access modifiers changed from: private */
        public static final Duration DEFAULT_INSTANCE;
        public static final int NANOS_FIELD_NUMBER = 2;
        private static volatile C63010eb PARSER = null;
        public static final int SECONDS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int nanos_;
        private long seconds_;

        /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$Duration$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements DurationOrBuilder {
            private Builder() {
                super(Duration.DEFAULT_INSTANCE);
            }

            public Builder clearNanos() {
                copyOnWrite();
                ((Duration) this.instance).clearNanos();
                return this;
            }

            public Builder clearSeconds() {
                copyOnWrite();
                ((Duration) this.instance).clearSeconds();
                return this;
            }

            public int getNanos() {
                return ((Duration) this.instance).getNanos();
            }

            public long getSeconds() {
                return ((Duration) this.instance).getSeconds();
            }

            public boolean hasNanos() {
                return ((Duration) this.instance).hasNanos();
            }

            public boolean hasSeconds() {
                return ((Duration) this.instance).hasSeconds();
            }

            public Builder setNanos(int i) {
                copyOnWrite();
                ((Duration) this.instance).setNanos(i);
                return this;
            }

            public Builder setSeconds(long j) {
                copyOnWrite();
                ((Duration) this.instance).setSeconds(j);
                return this;
            }

            public /* synthetic */ Builder(C47902a aVar) {
                this();
            }
        }

        static {
            Duration duration = new Duration();
            DEFAULT_INSTANCE = duration;
            C62942bv.registerDefaultInstance(Duration.class, duration);
        }

        private Duration() {
        }

        /* access modifiers changed from: private */
        public void clearNanos() {
            this.bitField0_ &= -3;
            this.nanos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSeconds() {
            this.bitField0_ &= -2;
            this.seconds_ = 0;
        }

        public static Duration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Duration parseDelimitedFrom(InputStream inputStream) {
            return (Duration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Duration parseFrom(C63088z zVar) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setNanos(int i) {
            this.bitField0_ |= 2;
            this.nanos_ = i;
        }

        /* access modifiers changed from: private */
        public void setSeconds(long j) {
            this.bitField0_ |= 1;
            this.seconds_ = j;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "seconds_", "nanos_"});
                case 3:
                    return new Duration();
                case 4:
                    return new Builder((C47902a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (Duration.class) {
                            ebVar = PARSER;
                            if (ebVar == null) {
                                ebVar = new C62935bo(DEFAULT_INSTANCE);
                                PARSER = ebVar;
                            }
                        }
                    }
                    return ebVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getNanos() {
            return this.nanos_;
        }

        public long getSeconds() {
            return this.seconds_;
        }

        public boolean hasNanos() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSeconds() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Duration duration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(duration);
        }

        public static Duration parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (Duration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Duration parseFrom(C63088z zVar, C62921ba baVar) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static Duration parseFrom(C62897ae aeVar) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static Duration parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static Duration parseFrom(InputStream inputStream) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static Duration parseFrom(InputStream inputStream, C62921ba baVar) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Duration parseFrom(ByteBuffer byteBuffer) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static Duration parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static Duration parseFrom(byte[] bArr) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static Duration parseFrom(byte[] bArr, C62921ba baVar) {
            return (Duration) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$DurationOrBuilder */
    /* compiled from: PG */
    public interface DurationOrBuilder extends C63001dt {
        int getNanos();

        long getSeconds();

        boolean hasNanos();

        boolean hasSeconds();
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$DurationReport */
    /* compiled from: PG */
    public final class DurationReport extends C62942bv implements DurationReportOrBuilder {
        public static final int CANCELLED_COUNT_FIELD_NUMBER = 6;
        public static final int COUNT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final DurationReport DEFAULT_INSTANCE;
        public static final int HISTOGRAM_FIELD_NUMBER = 7;
        public static final int MOVING_AVG_TIME_FIELD_NUMBER = 5;
        private static volatile C63010eb PARSER = null;
        public static final int PERCENTILE0_TIME_FIELD_NUMBER = 3;
        public static final int PERCENTILE100_TIME_FIELD_NUMBER = 4;
        public static final int TOTAL_TIME_FIELD_NUMBER = 2;
        private int bitField0_;
        private long cancelledCount_;
        private long count_;
        private SimpleHistogram histogram_;
        private Duration movingAvgTime_;
        private Duration percentile0Time_;
        private Duration percentile100Time_;
        private Duration totalTime_;

        /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$DurationReport$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements DurationReportOrBuilder {
            private Builder() {
                super(DurationReport.DEFAULT_INSTANCE);
            }

            public Builder clearCancelledCount() {
                copyOnWrite();
                ((DurationReport) this.instance).clearCancelledCount();
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((DurationReport) this.instance).clearCount();
                return this;
            }

            public Builder clearHistogram() {
                copyOnWrite();
                ((DurationReport) this.instance).clearHistogram();
                return this;
            }

            public Builder clearMovingAvgTime() {
                copyOnWrite();
                ((DurationReport) this.instance).clearMovingAvgTime();
                return this;
            }

            public Builder clearPercentile0Time() {
                copyOnWrite();
                ((DurationReport) this.instance).clearPercentile0Time();
                return this;
            }

            public Builder clearPercentile100Time() {
                copyOnWrite();
                ((DurationReport) this.instance).clearPercentile100Time();
                return this;
            }

            public Builder clearTotalTime() {
                copyOnWrite();
                ((DurationReport) this.instance).clearTotalTime();
                return this;
            }

            public long getCancelledCount() {
                return ((DurationReport) this.instance).getCancelledCount();
            }

            public long getCount() {
                return ((DurationReport) this.instance).getCount();
            }

            public SimpleHistogram getHistogram() {
                return ((DurationReport) this.instance).getHistogram();
            }

            public Duration getMovingAvgTime() {
                return ((DurationReport) this.instance).getMovingAvgTime();
            }

            public Duration getPercentile0Time() {
                return ((DurationReport) this.instance).getPercentile0Time();
            }

            public Duration getPercentile100Time() {
                return ((DurationReport) this.instance).getPercentile100Time();
            }

            public Duration getTotalTime() {
                return ((DurationReport) this.instance).getTotalTime();
            }

            public boolean hasCancelledCount() {
                return ((DurationReport) this.instance).hasCancelledCount();
            }

            public boolean hasCount() {
                return ((DurationReport) this.instance).hasCount();
            }

            public boolean hasHistogram() {
                return ((DurationReport) this.instance).hasHistogram();
            }

            public boolean hasMovingAvgTime() {
                return ((DurationReport) this.instance).hasMovingAvgTime();
            }

            public boolean hasPercentile0Time() {
                return ((DurationReport) this.instance).hasPercentile0Time();
            }

            public boolean hasPercentile100Time() {
                return ((DurationReport) this.instance).hasPercentile100Time();
            }

            public boolean hasTotalTime() {
                return ((DurationReport) this.instance).hasTotalTime();
            }

            public Builder mergeHistogram(SimpleHistogram simpleHistogram) {
                copyOnWrite();
                ((DurationReport) this.instance).mergeHistogram(simpleHistogram);
                return this;
            }

            public Builder mergeMovingAvgTime(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).mergeMovingAvgTime(duration);
                return this;
            }

            public Builder mergePercentile0Time(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).mergePercentile0Time(duration);
                return this;
            }

            public Builder mergePercentile100Time(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).mergePercentile100Time(duration);
                return this;
            }

            public Builder mergeTotalTime(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).mergeTotalTime(duration);
                return this;
            }

            public Builder setCancelledCount(long j) {
                copyOnWrite();
                ((DurationReport) this.instance).setCancelledCount(j);
                return this;
            }

            public Builder setCount(long j) {
                copyOnWrite();
                ((DurationReport) this.instance).setCount(j);
                return this;
            }

            public Builder setHistogram(SimpleHistogram.Builder builder) {
                copyOnWrite();
                ((DurationReport) this.instance).setHistogram((SimpleHistogram) builder.build());
                return this;
            }

            public Builder setMovingAvgTime(Duration.Builder builder) {
                copyOnWrite();
                ((DurationReport) this.instance).setMovingAvgTime((Duration) builder.build());
                return this;
            }

            public Builder setPercentile0Time(Duration.Builder builder) {
                copyOnWrite();
                ((DurationReport) this.instance).setPercentile0Time((Duration) builder.build());
                return this;
            }

            public Builder setPercentile100Time(Duration.Builder builder) {
                copyOnWrite();
                ((DurationReport) this.instance).setPercentile100Time((Duration) builder.build());
                return this;
            }

            public Builder setTotalTime(Duration.Builder builder) {
                copyOnWrite();
                ((DurationReport) this.instance).setTotalTime((Duration) builder.build());
                return this;
            }

            public /* synthetic */ Builder(C47902a aVar) {
                this();
            }

            public Builder setHistogram(SimpleHistogram simpleHistogram) {
                copyOnWrite();
                ((DurationReport) this.instance).setHistogram(simpleHistogram);
                return this;
            }

            public Builder setMovingAvgTime(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).setMovingAvgTime(duration);
                return this;
            }

            public Builder setPercentile0Time(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).setPercentile0Time(duration);
                return this;
            }

            public Builder setPercentile100Time(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).setPercentile100Time(duration);
                return this;
            }

            public Builder setTotalTime(Duration duration) {
                copyOnWrite();
                ((DurationReport) this.instance).setTotalTime(duration);
                return this;
            }
        }

        static {
            DurationReport durationReport = new DurationReport();
            DEFAULT_INSTANCE = durationReport;
            C62942bv.registerDefaultInstance(DurationReport.class, durationReport);
        }

        private DurationReport() {
        }

        /* access modifiers changed from: private */
        public void clearCancelledCount() {
            this.bitField0_ &= -33;
            this.cancelledCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHistogram() {
            this.histogram_ = null;
            this.bitField0_ &= -65;
        }

        /* access modifiers changed from: private */
        public void clearMovingAvgTime() {
            this.movingAvgTime_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearPercentile0Time() {
            this.percentile0Time_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearPercentile100Time() {
            this.percentile100Time_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearTotalTime() {
            this.totalTime_ = null;
            this.bitField0_ &= -3;
        }

        public static DurationReport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeHistogram(SimpleHistogram simpleHistogram) {
            simpleHistogram.getClass();
            SimpleHistogram simpleHistogram2 = this.histogram_;
            if (!(simpleHistogram2 == null || simpleHistogram2 == SimpleHistogram.getDefaultInstance())) {
                SimpleHistogram.Builder newBuilder = SimpleHistogram.newBuilder(simpleHistogram2);
                newBuilder.mergeFrom(simpleHistogram);
                simpleHistogram = (SimpleHistogram) newBuilder.buildPartial();
            }
            this.histogram_ = simpleHistogram;
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void mergeMovingAvgTime(Duration duration) {
            duration.getClass();
            Duration duration2 = this.movingAvgTime_;
            if (!(duration2 == null || duration2 == Duration.getDefaultInstance())) {
                Duration.Builder newBuilder = Duration.newBuilder(duration2);
                newBuilder.mergeFrom(duration);
                duration = (Duration) newBuilder.buildPartial();
            }
            this.movingAvgTime_ = duration;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergePercentile0Time(Duration duration) {
            duration.getClass();
            Duration duration2 = this.percentile0Time_;
            if (!(duration2 == null || duration2 == Duration.getDefaultInstance())) {
                Duration.Builder newBuilder = Duration.newBuilder(duration2);
                newBuilder.mergeFrom(duration);
                duration = (Duration) newBuilder.buildPartial();
            }
            this.percentile0Time_ = duration;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergePercentile100Time(Duration duration) {
            duration.getClass();
            Duration duration2 = this.percentile100Time_;
            if (!(duration2 == null || duration2 == Duration.getDefaultInstance())) {
                Duration.Builder newBuilder = Duration.newBuilder(duration2);
                newBuilder.mergeFrom(duration);
                duration = (Duration) newBuilder.buildPartial();
            }
            this.percentile100Time_ = duration;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeTotalTime(Duration duration) {
            duration.getClass();
            Duration duration2 = this.totalTime_;
            if (!(duration2 == null || duration2 == Duration.getDefaultInstance())) {
                Duration.Builder newBuilder = Duration.newBuilder(duration2);
                newBuilder.mergeFrom(duration);
                duration = (Duration) newBuilder.buildPartial();
            }
            this.totalTime_ = duration;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DurationReport parseDelimitedFrom(InputStream inputStream) {
            return (DurationReport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DurationReport parseFrom(C63088z zVar) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCancelledCount(long j) {
            this.bitField0_ |= 32;
            this.cancelledCount_ = j;
        }

        /* access modifiers changed from: private */
        public void setCount(long j) {
            this.bitField0_ |= 1;
            this.count_ = j;
        }

        /* access modifiers changed from: private */
        public void setHistogram(SimpleHistogram simpleHistogram) {
            simpleHistogram.getClass();
            this.histogram_ = simpleHistogram;
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setMovingAvgTime(Duration duration) {
            duration.getClass();
            this.movingAvgTime_ = duration;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setPercentile0Time(Duration duration) {
            duration.getClass();
            this.percentile0Time_ = duration;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setPercentile100Time(Duration duration) {
            duration.getClass();
            this.percentile100Time_ = duration;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setTotalTime(Duration duration) {
            duration.getClass();
            this.totalTime_ = duration;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "count_", "totalTime_", "percentile0Time_", "percentile100Time_", "movingAvgTime_", "cancelledCount_", "histogram_"});
                case 3:
                    return new DurationReport();
                case 4:
                    return new Builder((C47902a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (DurationReport.class) {
                            ebVar = PARSER;
                            if (ebVar == null) {
                                ebVar = new C62935bo(DEFAULT_INSTANCE);
                                PARSER = ebVar;
                            }
                        }
                    }
                    return ebVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public long getCancelledCount() {
            return this.cancelledCount_;
        }

        public long getCount() {
            return this.count_;
        }

        public SimpleHistogram getHistogram() {
            SimpleHistogram simpleHistogram = this.histogram_;
            return simpleHistogram == null ? SimpleHistogram.getDefaultInstance() : simpleHistogram;
        }

        public Duration getMovingAvgTime() {
            Duration duration = this.movingAvgTime_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getPercentile0Time() {
            Duration duration = this.percentile0Time_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getPercentile100Time() {
            Duration duration = this.percentile100Time_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getTotalTime() {
            Duration duration = this.totalTime_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public boolean hasCancelledCount() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasHistogram() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasMovingAvgTime() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPercentile0Time() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPercentile100Time() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTotalTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DurationReport durationReport) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(durationReport);
        }

        public static DurationReport parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (DurationReport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static DurationReport parseFrom(C63088z zVar, C62921ba baVar) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static DurationReport parseFrom(C62897ae aeVar) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static DurationReport parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static DurationReport parseFrom(InputStream inputStream) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static DurationReport parseFrom(InputStream inputStream, C62921ba baVar) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static DurationReport parseFrom(ByteBuffer byteBuffer) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static DurationReport parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static DurationReport parseFrom(byte[] bArr) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static DurationReport parseFrom(byte[] bArr, C62921ba baVar) {
            return (DurationReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$DurationReportOrBuilder */
    /* compiled from: PG */
    public interface DurationReportOrBuilder extends C63001dt {
        long getCancelledCount();

        long getCount();

        SimpleHistogram getHistogram();

        Duration getMovingAvgTime();

        Duration getPercentile0Time();

        Duration getPercentile100Time();

        Duration getTotalTime();

        boolean hasCancelledCount();

        boolean hasCount();

        boolean hasHistogram();

        boolean hasMovingAvgTime();

        boolean hasPercentile0Time();

        boolean hasPercentile100Time();

        boolean hasTotalTime();
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$PerformanceReport */
    /* compiled from: PG */
    public final class PerformanceReport extends C62942bv implements PerformanceReportOrBuilder {
        public static final int AR_SESSION_UPDATE_TIMING_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final PerformanceReport DEFAULT_INSTANCE;
        public static final int FILAMENT_FRAME_TIMING_FIELD_NUMBER = 4;
        public static final int FOREGROUND_EXECUTOR_TIMING_FIELD_NUMBER = 8;
        private static volatile C63010eb PARSER = null;
        public static final int START_TIME_FIELD_NUMBER = 6;
        public static final int TOTAL_DURATION_FIELD_NUMBER = 7;
        public static final int VIEW_ADVANCE_TIMING_FIELD_NUMBER = 3;
        public static final int VIEW_FRAME_TIMING_FIELD_NUMBER = 1;
        private DurationReport arSessionUpdateTiming_;
        private int bitField0_;
        private DurationReport filamentFrameTiming_;
        private DurationReport foregroundExecutorTiming_;
        private Timestamp startTime_;
        private Duration totalDuration_;
        private DurationReport viewAdvanceTiming_;
        private DurationReport viewFrameTiming_;

        /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$PerformanceReport$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements PerformanceReportOrBuilder {
            private Builder() {
                super(PerformanceReport.DEFAULT_INSTANCE);
            }

            public Builder clearArSessionUpdateTiming() {
                copyOnWrite();
                ((PerformanceReport) this.instance).clearArSessionUpdateTiming();
                return this;
            }

            public Builder clearFilamentFrameTiming() {
                copyOnWrite();
                ((PerformanceReport) this.instance).clearFilamentFrameTiming();
                return this;
            }

            public Builder clearForegroundExecutorTiming() {
                copyOnWrite();
                ((PerformanceReport) this.instance).clearForegroundExecutorTiming();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((PerformanceReport) this.instance).clearStartTime();
                return this;
            }

            public Builder clearTotalDuration() {
                copyOnWrite();
                ((PerformanceReport) this.instance).clearTotalDuration();
                return this;
            }

            public Builder clearViewAdvanceTiming() {
                copyOnWrite();
                ((PerformanceReport) this.instance).clearViewAdvanceTiming();
                return this;
            }

            public Builder clearViewFrameTiming() {
                copyOnWrite();
                ((PerformanceReport) this.instance).clearViewFrameTiming();
                return this;
            }

            public DurationReport getArSessionUpdateTiming() {
                return ((PerformanceReport) this.instance).getArSessionUpdateTiming();
            }

            public DurationReport getFilamentFrameTiming() {
                return ((PerformanceReport) this.instance).getFilamentFrameTiming();
            }

            public DurationReport getForegroundExecutorTiming() {
                return ((PerformanceReport) this.instance).getForegroundExecutorTiming();
            }

            public Timestamp getStartTime() {
                return ((PerformanceReport) this.instance).getStartTime();
            }

            public Duration getTotalDuration() {
                return ((PerformanceReport) this.instance).getTotalDuration();
            }

            public DurationReport getViewAdvanceTiming() {
                return ((PerformanceReport) this.instance).getViewAdvanceTiming();
            }

            public DurationReport getViewFrameTiming() {
                return ((PerformanceReport) this.instance).getViewFrameTiming();
            }

            public boolean hasArSessionUpdateTiming() {
                return ((PerformanceReport) this.instance).hasArSessionUpdateTiming();
            }

            public boolean hasFilamentFrameTiming() {
                return ((PerformanceReport) this.instance).hasFilamentFrameTiming();
            }

            public boolean hasForegroundExecutorTiming() {
                return ((PerformanceReport) this.instance).hasForegroundExecutorTiming();
            }

            public boolean hasStartTime() {
                return ((PerformanceReport) this.instance).hasStartTime();
            }

            public boolean hasTotalDuration() {
                return ((PerformanceReport) this.instance).hasTotalDuration();
            }

            public boolean hasViewAdvanceTiming() {
                return ((PerformanceReport) this.instance).hasViewAdvanceTiming();
            }

            public boolean hasViewFrameTiming() {
                return ((PerformanceReport) this.instance).hasViewFrameTiming();
            }

            public Builder mergeArSessionUpdateTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).mergeArSessionUpdateTiming(durationReport);
                return this;
            }

            public Builder mergeFilamentFrameTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).mergeFilamentFrameTiming(durationReport);
                return this;
            }

            public Builder mergeForegroundExecutorTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).mergeForegroundExecutorTiming(durationReport);
                return this;
            }

            public Builder mergeStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((PerformanceReport) this.instance).mergeStartTime(timestamp);
                return this;
            }

            public Builder mergeTotalDuration(Duration duration) {
                copyOnWrite();
                ((PerformanceReport) this.instance).mergeTotalDuration(duration);
                return this;
            }

            public Builder mergeViewAdvanceTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).mergeViewAdvanceTiming(durationReport);
                return this;
            }

            public Builder mergeViewFrameTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).mergeViewFrameTiming(durationReport);
                return this;
            }

            public Builder setArSessionUpdateTiming(DurationReport.Builder builder) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setArSessionUpdateTiming((DurationReport) builder.build());
                return this;
            }

            public Builder setFilamentFrameTiming(DurationReport.Builder builder) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setFilamentFrameTiming((DurationReport) builder.build());
                return this;
            }

            public Builder setForegroundExecutorTiming(DurationReport.Builder builder) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setForegroundExecutorTiming((DurationReport) builder.build());
                return this;
            }

            public Builder setStartTime(Timestamp.Builder builder) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setStartTime((Timestamp) builder.build());
                return this;
            }

            public Builder setTotalDuration(Duration.Builder builder) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setTotalDuration((Duration) builder.build());
                return this;
            }

            public Builder setViewAdvanceTiming(DurationReport.Builder builder) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setViewAdvanceTiming((DurationReport) builder.build());
                return this;
            }

            public Builder setViewFrameTiming(DurationReport.Builder builder) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setViewFrameTiming((DurationReport) builder.build());
                return this;
            }

            public /* synthetic */ Builder(C47902a aVar) {
                this();
            }

            public Builder setArSessionUpdateTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setArSessionUpdateTiming(durationReport);
                return this;
            }

            public Builder setFilamentFrameTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setFilamentFrameTiming(durationReport);
                return this;
            }

            public Builder setForegroundExecutorTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setForegroundExecutorTiming(durationReport);
                return this;
            }

            public Builder setStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setStartTime(timestamp);
                return this;
            }

            public Builder setTotalDuration(Duration duration) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setTotalDuration(duration);
                return this;
            }

            public Builder setViewAdvanceTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setViewAdvanceTiming(durationReport);
                return this;
            }

            public Builder setViewFrameTiming(DurationReport durationReport) {
                copyOnWrite();
                ((PerformanceReport) this.instance).setViewFrameTiming(durationReport);
                return this;
            }
        }

        static {
            PerformanceReport performanceReport = new PerformanceReport();
            DEFAULT_INSTANCE = performanceReport;
            C62942bv.registerDefaultInstance(PerformanceReport.class, performanceReport);
        }

        private PerformanceReport() {
        }

        /* access modifiers changed from: private */
        public void clearArSessionUpdateTiming() {
            this.arSessionUpdateTiming_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearFilamentFrameTiming() {
            this.filamentFrameTiming_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearForegroundExecutorTiming() {
            this.foregroundExecutorTiming_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = null;
            this.bitField0_ &= -33;
        }

        /* access modifiers changed from: private */
        public void clearTotalDuration() {
            this.totalDuration_ = null;
            this.bitField0_ &= -65;
        }

        /* access modifiers changed from: private */
        public void clearViewAdvanceTiming() {
            this.viewAdvanceTiming_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearViewFrameTiming() {
            this.viewFrameTiming_ = null;
            this.bitField0_ &= -2;
        }

        public static PerformanceReport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeArSessionUpdateTiming(DurationReport durationReport) {
            durationReport.getClass();
            DurationReport durationReport2 = this.arSessionUpdateTiming_;
            if (!(durationReport2 == null || durationReport2 == DurationReport.getDefaultInstance())) {
                DurationReport.Builder newBuilder = DurationReport.newBuilder(durationReport2);
                newBuilder.mergeFrom(durationReport);
                durationReport = (DurationReport) newBuilder.buildPartial();
            }
            this.arSessionUpdateTiming_ = durationReport;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeFilamentFrameTiming(DurationReport durationReport) {
            durationReport.getClass();
            DurationReport durationReport2 = this.filamentFrameTiming_;
            if (!(durationReport2 == null || durationReport2 == DurationReport.getDefaultInstance())) {
                DurationReport.Builder newBuilder = DurationReport.newBuilder(durationReport2);
                newBuilder.mergeFrom(durationReport);
                durationReport = (DurationReport) newBuilder.buildPartial();
            }
            this.filamentFrameTiming_ = durationReport;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeForegroundExecutorTiming(DurationReport durationReport) {
            durationReport.getClass();
            DurationReport durationReport2 = this.foregroundExecutorTiming_;
            if (!(durationReport2 == null || durationReport2 == DurationReport.getDefaultInstance())) {
                DurationReport.Builder newBuilder = DurationReport.newBuilder(durationReport2);
                newBuilder.mergeFrom(durationReport);
                durationReport = (DurationReport) newBuilder.buildPartial();
            }
            this.foregroundExecutorTiming_ = durationReport;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergeStartTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.startTime_;
            if (!(timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance())) {
                Timestamp.Builder newBuilder = Timestamp.newBuilder(timestamp2);
                newBuilder.mergeFrom(timestamp);
                timestamp = (Timestamp) newBuilder.buildPartial();
            }
            this.startTime_ = timestamp;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeTotalDuration(Duration duration) {
            duration.getClass();
            Duration duration2 = this.totalDuration_;
            if (!(duration2 == null || duration2 == Duration.getDefaultInstance())) {
                Duration.Builder newBuilder = Duration.newBuilder(duration2);
                newBuilder.mergeFrom(duration);
                duration = (Duration) newBuilder.buildPartial();
            }
            this.totalDuration_ = duration;
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void mergeViewAdvanceTiming(DurationReport durationReport) {
            durationReport.getClass();
            DurationReport durationReport2 = this.viewAdvanceTiming_;
            if (!(durationReport2 == null || durationReport2 == DurationReport.getDefaultInstance())) {
                DurationReport.Builder newBuilder = DurationReport.newBuilder(durationReport2);
                newBuilder.mergeFrom(durationReport);
                durationReport = (DurationReport) newBuilder.buildPartial();
            }
            this.viewAdvanceTiming_ = durationReport;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeViewFrameTiming(DurationReport durationReport) {
            durationReport.getClass();
            DurationReport durationReport2 = this.viewFrameTiming_;
            if (!(durationReport2 == null || durationReport2 == DurationReport.getDefaultInstance())) {
                DurationReport.Builder newBuilder = DurationReport.newBuilder(durationReport2);
                newBuilder.mergeFrom(durationReport);
                durationReport = (DurationReport) newBuilder.buildPartial();
            }
            this.viewFrameTiming_ = durationReport;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PerformanceReport parseDelimitedFrom(InputStream inputStream) {
            return (PerformanceReport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PerformanceReport parseFrom(C63088z zVar) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setArSessionUpdateTiming(DurationReport durationReport) {
            durationReport.getClass();
            this.arSessionUpdateTiming_ = durationReport;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setFilamentFrameTiming(DurationReport durationReport) {
            durationReport.getClass();
            this.filamentFrameTiming_ = durationReport;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setForegroundExecutorTiming(DurationReport durationReport) {
            durationReport.getClass();
            this.foregroundExecutorTiming_ = durationReport;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setStartTime(Timestamp timestamp) {
            timestamp.getClass();
            this.startTime_ = timestamp;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setTotalDuration(Duration duration) {
            duration.getClass();
            this.totalDuration_ = duration;
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setViewAdvanceTiming(DurationReport durationReport) {
            durationReport.getClass();
            this.viewAdvanceTiming_ = durationReport;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setViewFrameTiming(DurationReport durationReport) {
            durationReport.getClass();
            this.viewFrameTiming_ = durationReport;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0004", new Object[]{"bitField0_", "viewFrameTiming_", "arSessionUpdateTiming_", "viewAdvanceTiming_", "filamentFrameTiming_", "startTime_", "totalDuration_", "foregroundExecutorTiming_"});
                case 3:
                    return new PerformanceReport();
                case 4:
                    return new Builder((C47902a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (PerformanceReport.class) {
                            ebVar = PARSER;
                            if (ebVar == null) {
                                ebVar = new C62935bo(DEFAULT_INSTANCE);
                                PARSER = ebVar;
                            }
                        }
                    }
                    return ebVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DurationReport getArSessionUpdateTiming() {
            DurationReport durationReport = this.arSessionUpdateTiming_;
            return durationReport == null ? DurationReport.getDefaultInstance() : durationReport;
        }

        public DurationReport getFilamentFrameTiming() {
            DurationReport durationReport = this.filamentFrameTiming_;
            return durationReport == null ? DurationReport.getDefaultInstance() : durationReport;
        }

        public DurationReport getForegroundExecutorTiming() {
            DurationReport durationReport = this.foregroundExecutorTiming_;
            return durationReport == null ? DurationReport.getDefaultInstance() : durationReport;
        }

        public Timestamp getStartTime() {
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Duration getTotalDuration() {
            Duration duration = this.totalDuration_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public DurationReport getViewAdvanceTiming() {
            DurationReport durationReport = this.viewAdvanceTiming_;
            return durationReport == null ? DurationReport.getDefaultInstance() : durationReport;
        }

        public DurationReport getViewFrameTiming() {
            DurationReport durationReport = this.viewFrameTiming_;
            return durationReport == null ? DurationReport.getDefaultInstance() : durationReport;
        }

        public boolean hasArSessionUpdateTiming() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFilamentFrameTiming() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasForegroundExecutorTiming() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasStartTime() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTotalDuration() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasViewAdvanceTiming() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasViewFrameTiming() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(PerformanceReport performanceReport) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(performanceReport);
        }

        public static PerformanceReport parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (PerformanceReport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static PerformanceReport parseFrom(C63088z zVar, C62921ba baVar) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static PerformanceReport parseFrom(C62897ae aeVar) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static PerformanceReport parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static PerformanceReport parseFrom(InputStream inputStream) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static PerformanceReport parseFrom(InputStream inputStream, C62921ba baVar) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static PerformanceReport parseFrom(ByteBuffer byteBuffer) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static PerformanceReport parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static PerformanceReport parseFrom(byte[] bArr) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static PerformanceReport parseFrom(byte[] bArr, C62921ba baVar) {
            return (PerformanceReport) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$PerformanceReportOrBuilder */
    /* compiled from: PG */
    public interface PerformanceReportOrBuilder extends C63001dt {
        DurationReport getArSessionUpdateTiming();

        DurationReport getFilamentFrameTiming();

        DurationReport getForegroundExecutorTiming();

        Timestamp getStartTime();

        Duration getTotalDuration();

        DurationReport getViewAdvanceTiming();

        DurationReport getViewFrameTiming();

        boolean hasArSessionUpdateTiming();

        boolean hasFilamentFrameTiming();

        boolean hasForegroundExecutorTiming();

        boolean hasStartTime();

        boolean hasTotalDuration();

        boolean hasViewAdvanceTiming();

        boolean hasViewFrameTiming();
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$SimpleHistogram */
    /* compiled from: PG */
    public final class SimpleHistogram extends C62942bv implements SimpleHistogramOrBuilder {
        public static final int COUNT_BELOW_RANGE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SimpleHistogram DEFAULT_INSTANCE;
        public static final int MS_VS_COUNT_FIELD_NUMBER = 1;
        private static volatile C63010eb PARSER;
        private int bitField0_;
        private int countBelowRange_;
        private C62995dn msVsCount_ = C62995dn.f170057a;

        /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$SimpleHistogram$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements SimpleHistogramOrBuilder {
            private Builder() {
                super(SimpleHistogram.DEFAULT_INSTANCE);
            }

            public Builder clearCountBelowRange() {
                copyOnWrite();
                ((SimpleHistogram) this.instance).clearCountBelowRange();
                return this;
            }

            public Builder clearMsVsCount() {
                copyOnWrite();
                ((SimpleHistogram) this.instance).getMutableMsVsCountMap().clear();
                return this;
            }

            public boolean containsMsVsCount(long j) {
                return ((SimpleHistogram) this.instance).getMsVsCountMap().containsKey(Long.valueOf(j));
            }

            public int getCountBelowRange() {
                return ((SimpleHistogram) this.instance).getCountBelowRange();
            }

            public int getMsVsCountCount() {
                return ((SimpleHistogram) this.instance).getMsVsCountMap().size();
            }

            public Map getMsVsCountMap() {
                return Collections.unmodifiableMap(((SimpleHistogram) this.instance).getMsVsCountMap());
            }

            public int getMsVsCountOrDefault(long j, int i) {
                Map msVsCountMap = ((SimpleHistogram) this.instance).getMsVsCountMap();
                Long valueOf = Long.valueOf(j);
                return msVsCountMap.containsKey(valueOf) ? ((Integer) msVsCountMap.get(valueOf)).intValue() : i;
            }

            public int getMsVsCountOrThrow(long j) {
                Map msVsCountMap = ((SimpleHistogram) this.instance).getMsVsCountMap();
                Long valueOf = Long.valueOf(j);
                if (msVsCountMap.containsKey(valueOf)) {
                    return ((Integer) msVsCountMap.get(valueOf)).intValue();
                }
                throw new IllegalArgumentException();
            }

            public boolean hasCountBelowRange() {
                return ((SimpleHistogram) this.instance).hasCountBelowRange();
            }

            public Builder putAllMsVsCount(Map map) {
                copyOnWrite();
                ((SimpleHistogram) this.instance).getMutableMsVsCountMap().putAll(map);
                return this;
            }

            public Builder putMsVsCount(long j, int i) {
                copyOnWrite();
                ((SimpleHistogram) this.instance).getMutableMsVsCountMap().put(Long.valueOf(j), Integer.valueOf(i));
                return this;
            }

            public Builder removeMsVsCount(long j) {
                copyOnWrite();
                ((SimpleHistogram) this.instance).getMutableMsVsCountMap().remove(Long.valueOf(j));
                return this;
            }

            public Builder setCountBelowRange(int i) {
                copyOnWrite();
                ((SimpleHistogram) this.instance).setCountBelowRange(i);
                return this;
            }

            public /* synthetic */ Builder(C47902a aVar) {
                this();
            }
        }

        static {
            SimpleHistogram simpleHistogram = new SimpleHistogram();
            DEFAULT_INSTANCE = simpleHistogram;
            C62942bv.registerDefaultInstance(SimpleHistogram.class, simpleHistogram);
        }

        private SimpleHistogram() {
        }

        /* access modifiers changed from: private */
        public void clearCountBelowRange() {
            this.bitField0_ &= -2;
            this.countBelowRange_ = 0;
        }

        public static SimpleHistogram getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public Map getMutableMsVsCountMap() {
            return internalGetMutableMsVsCount();
        }

        private C62995dn internalGetMsVsCount() {
            return this.msVsCount_;
        }

        private C62995dn internalGetMutableMsVsCount() {
            C62995dn dnVar = this.msVsCount_;
            if (!dnVar.f170058b) {
                this.msVsCount_ = dnVar.mo58980a();
            }
            return this.msVsCount_;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SimpleHistogram parseDelimitedFrom(InputStream inputStream) {
            return (SimpleHistogram) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SimpleHistogram parseFrom(C63088z zVar) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCountBelowRange(int i) {
            this.bitField0_ |= 1;
            this.countBelowRange_ = i;
        }

        public boolean containsMsVsCount(long j) {
            return internalGetMsVsCount().containsKey(Long.valueOf(j));
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002င\u0000", new Object[]{"bitField0_", "msVsCount_", C47903b.f124041a, "countBelowRange_"});
                case 3:
                    return new SimpleHistogram();
                case 4:
                    return new Builder((C47902a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (SimpleHistogram.class) {
                            ebVar = PARSER;
                            if (ebVar == null) {
                                ebVar = new C62935bo(DEFAULT_INSTANCE);
                                PARSER = ebVar;
                            }
                        }
                    }
                    return ebVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getCountBelowRange() {
            return this.countBelowRange_;
        }

        public int getMsVsCountCount() {
            return internalGetMsVsCount().size();
        }

        public Map getMsVsCountMap() {
            return Collections.unmodifiableMap(internalGetMsVsCount());
        }

        public int getMsVsCountOrDefault(long j, int i) {
            C62995dn internalGetMsVsCount = internalGetMsVsCount();
            Long valueOf = Long.valueOf(j);
            return internalGetMsVsCount.containsKey(valueOf) ? ((Integer) internalGetMsVsCount.get(valueOf)).intValue() : i;
        }

        public int getMsVsCountOrThrow(long j) {
            C62995dn internalGetMsVsCount = internalGetMsVsCount();
            Long valueOf = Long.valueOf(j);
            if (internalGetMsVsCount.containsKey(valueOf)) {
                return ((Integer) internalGetMsVsCount.get(valueOf)).intValue();
            }
            throw new IllegalArgumentException();
        }

        public boolean hasCountBelowRange() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SimpleHistogram simpleHistogram) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(simpleHistogram);
        }

        public static SimpleHistogram parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (SimpleHistogram) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SimpleHistogram parseFrom(C63088z zVar, C62921ba baVar) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static SimpleHistogram parseFrom(C62897ae aeVar) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static SimpleHistogram parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static SimpleHistogram parseFrom(InputStream inputStream) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static SimpleHistogram parseFrom(InputStream inputStream, C62921ba baVar) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SimpleHistogram parseFrom(ByteBuffer byteBuffer) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static SimpleHistogram parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static SimpleHistogram parseFrom(byte[] bArr) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static SimpleHistogram parseFrom(byte[] bArr, C62921ba baVar) {
            return (SimpleHistogram) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$SimpleHistogramOrBuilder */
    /* compiled from: PG */
    public interface SimpleHistogramOrBuilder extends C63001dt {
        boolean containsMsVsCount(long j);

        int getCountBelowRange();

        int getMsVsCountCount();

        Map getMsVsCountMap();

        int getMsVsCountOrDefault(long j, int i);

        int getMsVsCountOrThrow(long j);

        boolean hasCountBelowRange();
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$Timestamp */
    /* compiled from: PG */
    public final class Timestamp extends C62942bv implements TimestampOrBuilder {
        /* access modifiers changed from: private */
        public static final Timestamp DEFAULT_INSTANCE;
        public static final int NANOS_FIELD_NUMBER = 2;
        private static volatile C63010eb PARSER = null;
        public static final int SECONDS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int nanos_;
        private long seconds_;

        /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$Timestamp$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements TimestampOrBuilder {
            private Builder() {
                super(Timestamp.DEFAULT_INSTANCE);
            }

            public Builder clearNanos() {
                copyOnWrite();
                ((Timestamp) this.instance).clearNanos();
                return this;
            }

            public Builder clearSeconds() {
                copyOnWrite();
                ((Timestamp) this.instance).clearSeconds();
                return this;
            }

            public int getNanos() {
                return ((Timestamp) this.instance).getNanos();
            }

            public long getSeconds() {
                return ((Timestamp) this.instance).getSeconds();
            }

            public boolean hasNanos() {
                return ((Timestamp) this.instance).hasNanos();
            }

            public boolean hasSeconds() {
                return ((Timestamp) this.instance).hasSeconds();
            }

            public Builder setNanos(int i) {
                copyOnWrite();
                ((Timestamp) this.instance).setNanos(i);
                return this;
            }

            public Builder setSeconds(long j) {
                copyOnWrite();
                ((Timestamp) this.instance).setSeconds(j);
                return this;
            }

            public /* synthetic */ Builder(C47902a aVar) {
                this();
            }
        }

        static {
            Timestamp timestamp = new Timestamp();
            DEFAULT_INSTANCE = timestamp;
            C62942bv.registerDefaultInstance(Timestamp.class, timestamp);
        }

        private Timestamp() {
        }

        /* access modifiers changed from: private */
        public void clearNanos() {
            this.bitField0_ &= -3;
            this.nanos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSeconds() {
            this.bitField0_ &= -2;
            this.seconds_ = 0;
        }

        public static Timestamp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Timestamp parseDelimitedFrom(InputStream inputStream) {
            return (Timestamp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamp parseFrom(C63088z zVar) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setNanos(int i) {
            this.bitField0_ |= 2;
            this.nanos_ = i;
        }

        /* access modifiers changed from: private */
        public void setSeconds(long j) {
            this.bitField0_ |= 1;
            this.seconds_ = j;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "seconds_", "nanos_"});
                case 3:
                    return new Timestamp();
                case 4:
                    return new Builder((C47902a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (Timestamp.class) {
                            ebVar = PARSER;
                            if (ebVar == null) {
                                ebVar = new C62935bo(DEFAULT_INSTANCE);
                                PARSER = ebVar;
                            }
                        }
                    }
                    return ebVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getNanos() {
            return this.nanos_;
        }

        public long getSeconds() {
            return this.seconds_;
        }

        public boolean hasNanos() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSeconds() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Timestamp timestamp) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(timestamp);
        }

        public static Timestamp parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (Timestamp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Timestamp parseFrom(C63088z zVar, C62921ba baVar) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static Timestamp parseFrom(C62897ae aeVar) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static Timestamp parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static Timestamp parseFrom(InputStream inputStream) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamp parseFrom(InputStream inputStream, C62921ba baVar) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Timestamp parseFrom(ByteBuffer byteBuffer) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static Timestamp parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static Timestamp parseFrom(byte[] bArr) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static Timestamp parseFrom(byte[] bArr, C62921ba baVar) {
            return (Timestamp) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.impress.analytics.ImpressLogOuterClass$TimestampOrBuilder */
    /* compiled from: PG */
    public interface TimestampOrBuilder extends C63001dt {
        int getNanos();

        long getSeconds();

        boolean hasNanos();

        boolean hasSeconds();
    }

    private ImpressLogOuterClass() {
    }

    public static void registerAllExtensions(C62921ba baVar) {
    }
}
