package com.google.android.libraries.p579ar.sceneviewer.immersiveedge.sidechannelevent;

import com.evernote.android.state.BuildConfig;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager */
/* compiled from: PG */
public interface SideChannelEventManager {

    /* renamed from: com.google.android.libraries.ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager$EventType */
    /* compiled from: PG */
    public enum EventType {
        SWITCH_TO_AR_MODE("SwitchToArMode"),
        OPEN_LINK("OpenLink"),
        NOT_SUPPORTED(BuildConfig.FLAVOR);
        
        private final String message;

        private EventType(String str) {
            this.message = str;
        }

        public static EventType getEventTypeFromString(String str) {
            for (EventType eventType : values()) {
                if (Objects.equals(eventType.message, str)) {
                    return eventType;
                }
            }
            return NOT_SUPPORTED;
        }
    }

    void handleSideChannelEvent(int i, String str, String str2);

    void sendSideChannelEventReturnCode(int i, int i2);
}
