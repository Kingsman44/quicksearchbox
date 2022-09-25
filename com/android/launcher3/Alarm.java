package com.android.launcher3;

import android.os.Handler;

/* compiled from: PG */
public final class Alarm implements Runnable {
    public OnAlarmListener mAlarmListener;
    public boolean mAlarmPending = false;
    private long mAlarmTriggerTime;
    private final Handler mHandler = new Handler();
    private boolean mWaitingForCallback;

    public final void cancelAlarm() {
        this.mAlarmTriggerTime = 0;
        this.mAlarmPending = false;
    }

    public final void run() {
        this.mWaitingForCallback = false;
        if (this.mAlarmTriggerTime != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.mAlarmTriggerTime;
            if (j > currentTimeMillis) {
                this.mHandler.postDelayed(this, Math.max(0, j - currentTimeMillis));
                this.mWaitingForCallback = true;
                return;
            }
            this.mAlarmPending = false;
            OnAlarmListener onAlarmListener = this.mAlarmListener;
            if (onAlarmListener != null) {
                onAlarmListener.onAlarm$ar$ds();
            }
        }
    }

    public final void setAlarm(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        this.mAlarmPending = true;
        long j2 = j + currentTimeMillis;
        this.mAlarmTriggerTime = j2;
        if (!this.mWaitingForCallback) {
            this.mHandler.postDelayed(this, j2 - currentTimeMillis);
            this.mWaitingForCallback = true;
        }
    }
}
