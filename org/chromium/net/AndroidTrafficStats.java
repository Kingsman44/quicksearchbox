package org.chromium.net;

import android.net.TrafficStats;
import android.os.Process;

/* compiled from: PG */
public class AndroidTrafficStats {
    private AndroidTrafficStats() {
    }

    private static long getCurrentUidRxBytes() {
        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
        if (uidRxBytes != -1) {
            return uidRxBytes;
        }
        return 0;
    }

    private static long getCurrentUidTxBytes() {
        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
        if (uidTxBytes != -1) {
            return uidTxBytes;
        }
        return 0;
    }

    private static long getTotalRxBytes() {
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        if (totalRxBytes != -1) {
            return totalRxBytes;
        }
        return 0;
    }

    private static long getTotalTxBytes() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        if (totalTxBytes != -1) {
            return totalTxBytes;
        }
        return 0;
    }
}
