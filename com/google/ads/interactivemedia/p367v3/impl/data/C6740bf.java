package com.google.ads.interactivemedia.p367v3.impl.data;

import android.util.Log;
import com.google.ads.interactivemedia.p367v3.internal.auj;
import com.google.ads.interactivemedia.p367v3.internal.aul;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bf */
/* compiled from: PG */
public final class C6740bf {
    public double adBreakDuration;
    public String adBreakTime;
    public List adCuePoints;
    public C6755c adData;
    public double adPeriodDuration;
    public C6756d adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public double bufferedTime;
    public Map companions;
    public List cuepoints;
    public double currentTime;
    public double duration;
    public int errorCode;
    public String errorMessage;
    public String eventId;
    public String innerError;
    public SortedSet internalCuePoints;

    /* renamed from: ln */
    public String f20043ln;
    public C6739be logData;

    /* renamed from: m */
    public String f20044m;
    public boolean monitorAppLifecycle;

    /* renamed from: n */
    public String f20045n;
    public C6742bh networkRequest;
    public String queryId;
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo;
    public double seekTime;
    public String streamId;
    public String streamUrl;
    public List subtitles;
    public int totalAds;
    public String url;
    public String vastEvent;
    public String videoUrl;

    public boolean equals(Object obj) {
        return auj.m19669c(this, obj, new String[0]);
    }

    public int hashCode() {
        return aul.m19677b(this, new String[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JavaScriptMsgData[");
        for (Field field : C6740bf.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb.append(field.getName());
                sb.append(":");
                sb.append(obj);
                sb.append(",");
            } catch (IllegalArgumentException e) {
                Log.e("IMASDK", "IllegalArgumentException occurred", e);
            } catch (IllegalAccessException e2) {
                Log.e("IMASDK", "IllegalAccessException occurred", e2);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
