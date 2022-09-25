package com.android.launcher3.allapps;

import android.os.Handler;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
public final class DefaultAppSearchAlgorithm {
    public static final Pattern SPLIT_PATTERN = Pattern.compile("[\\s|\\p{javaSpaceChar}]+");
    public final List mApps;
    protected final Handler mResultHandler = new Handler();

    public DefaultAppSearchAlgorithm(List list) {
        this.mApps = list;
    }
}
