package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.bl;
import com.google.android.apps.gsa.nga.api.a.e;
import com.google.android.apps.gsa.nga.api.a.f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126287a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bt */
/* compiled from: PG */
public final class C126055bt {

    /* renamed from: a */
    public static final C63070h f347416a;

    /* renamed from: b */
    public static final f f347417b;

    /* renamed from: c */
    public static final C58495hd f347418c;

    /* renamed from: d */
    public static final C58495hd f347419d;

    static {
        C63070h b = C126287a.m206488b("java.com.google.android.apps.gsa.nga.api.proto.OverlayLearningCenterButtonPayload", bl.a);
        f347416a = b;
        e createBuilder = f.g.createBuilder();
        createBuilder.copyOnWrite();
        b.getClass();
        createBuilder.instance.d = b;
        f347417b = createBuilder.build();
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("text.REMOVE_ALL_TEXT", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_remove_all_text));
        gzVar.mo55429h("text.REMOVE_LAST_WORD", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_remove_last_word));
        gzVar.mo55429h("text.REMOVE_LAST_SENTENCE", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_remove_last_sentence));
        gzVar.mo55429h("text.REMOVE_CURRENT_ORATION", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_remove_current_oration));
        gzVar.mo55429h("text.REMOVE_SELECTED_TEXT", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_remove_selected_text));
        gzVar.mo55429h("text.NEXT_FIELD", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_next_field));
        gzVar.mo55429h("text.PREVIOUS_FIELD", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_previous_field));
        gzVar.mo55429h("text.SEARCH", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_search));
        gzVar.mo55429h("text.UNDO", Integer.valueOf(R.string.assistant_keyboard_announce_command_execution_undo));
        f347418c = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("text.END_DICTATION", C125044j.CLOSE);
        gzVar2.mo55429h("text.REMOVE_ALL_TEXT", C125044j.CLEAR_ALL);
        gzVar2.mo55429h("text.REMOVE_LAST_SENTENCE", C125044j.CLEAR);
        gzVar2.mo55429h("text.REMOVE_CURRENT_ORATION", C125044j.CLEAR);
        gzVar2.mo55429h("text.REMOVE_SELECTED_TEXT", C125044j.CLEAR);
        gzVar2.mo55429h("text.NEXT_FIELD", C125044j.NEXT);
        gzVar2.mo55429h("text.PREVIOUS_FIELD", C125044j.PREVIOUS);
        gzVar2.mo55429h("text.SEARCH", C125044j.SEARCH);
        gzVar2.mo55429h("text.SEND", C125044j.SEND);
        gzVar2.mo55429h("text.UNDO", C125044j.UNDO);
        gzVar2.mo55429h("text.DICTATE", C125044j.EMOJI_SUGGESTION);
        f347419d = gzVar2.mo55427f(false);
    }
}
